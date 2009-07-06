/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.catacombae.jfuse.util;

/**
 *
 * @author erik
 */
public class Log {
    public static void traceEnter(String methodName, Object... args) {
        StringBuilder sb = new StringBuilder("ENTER: ");
        sb.append(methodName).append("(");
        for(int i = 0; i < args.length; ++i) {
            if(i != 0)
                sb.append(", ");
            sb.append(args[i]);
        }
        sb.append(")");
        
        System.err.println(sb.toString());
    }

    public static void traceLeave(String methodName, Object retval, Object... args) {
        StringBuilder sb = new StringBuilder("LEAVE: ");
        sb.append(methodName).append("(");
        for(int i = 0; i < args.length; ++i) {
            if(i != 0)
                sb.append(", ");
            sb.append(args[i]);
        }
        sb.append("): ").append(retval);

        System.err.println(sb.toString());
    }

    public static void traceLeaveVoid(String methodName, Object... args) {
        StringBuilder sb = new StringBuilder("LEAVE: ");
        sb.append(methodName).append("(");
        for(int i = 0; i < args.length; ++i) {
            if(i != 0)
                sb.append(", ");
            sb.append(args[i]);
        }
        sb.append(")");

        System.err.println(sb.toString());
    }

    /**
     * Free form TRACE level log message.
     * @param msg
     */
    public static void trace(String msg) {
        System.err.println("TRACE: " + msg);
    }

    public static void debug(String msg) {
        System.err.println("DEBUG: " + msg);
    }

    public static void warning(String msg) {
        System.err.println("WARNING: " + msg);
    }

    public static void error(String msg) {
        System.err.println("ERROR: " + msg);
    }
}
