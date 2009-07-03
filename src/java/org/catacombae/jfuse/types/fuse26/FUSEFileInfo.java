/*-
 * jFUSE - FUSE bindings for Java
 * Copyright (C) 2008-2009  Erik Larsson <erik82@kth.se>
 *
 * Derived from:
 *   FUSE: Filesystem in Userspace
 *   Copyright (C) 2001-2007  Miklos Szeredi <miklos@szeredi.hu>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.catacombae.jfuse.types.fuse26;

/**
 *
 * @author erik
 */
public class FUSEFileInfo {
    /* open for reading only */
    public static final int O_RDONLY = 0x0;       // 000000000000000000000000
    /** open for writing only */
    public static final int O_WRONLY = 0x1;       // 000000000000000000000001
    /** open for reading and writing */
    public static final int O_RDWR = 0x2;         // 000000000000000000000010
    /** do not block on open or for data to become available */
    public static final int O_NONBLOCK = 0x4;     // 000000000000000000000100
    /** append on each write */
    public static final int O_APPEND = 0x8;       // 000000000000000000001000
    /** create file if it does not exist */
    public static final int O_CREAT = 0x200;      // 000000000000001000000000
    /** truncate size to 0 */
    public static final int O_TRUNC = 0x400;      // 000000000000010000000000
    /** error if public static final int O_CREAT and the file exists */
    public static final int O_EXCL = 0x800;       // 000000000000100000000000
    /** atomically obtain a shared lock */
    public static final int O_SHLOCK = 0x10;      // 000000000000000000010000
    /** atomically obtain an exclusive lock */
    public static final int O_EXLOCK = 0x20;      // 000000000000000000100000
    /** do not follow symlinks */
    public static final int O_NOFOLLOW = 0x100;   // 000000000000000100000000
    /** allow open of symlinks */
    public static final int O_SYMLINK = 0x200000; // 001000000000000000000000

	/** Open flags.	 Available in open() and release() */
	public int flags;

	/** Old file handle, don't use */
	public long fh_old;

	/** In case of a write operation indicates if this was caused by a
	    writepage */
    public int writepage;

	/** Can be filled in by open, to use direct I/O on this file.
	    Introduced in version 2.4 */
	public boolean direct_io;

	/** Can be filled in by open, to indicate, that cached file data
	    need not be invalidated.  Introduced in version 2.4 */
	public boolean keep_cache;

	/** Indicates a flush operation.  Set in flush operation, also
	    maybe set in highlevel lock operation and lowlevel release
	    operation.	Introduced in version 2.6 */
	public boolean flush;

	/** Padding.  Do not use*/
	//unsigned int padding : 29;

	/** File handle.  May be filled in by filesystem in open().
	    Available in all other file operations */
	public long fh;

	/** Lock owner id.  Available in locking operations and flush */
	public long lock_owner;

}