package r1;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
public class b extends InputStream implements DataInput {
    public static final ByteOrder f44754e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f44755f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream f44756a;
    public ByteOrder f44757b;
    public int f44758c;
    public byte[] d;

    public b(byte[] r2) {
        throw new UnsupportedOperationException("Method not decompiled: r1.b.<init>(byte[]):void");
    }

    public final void a(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f44756a;
            int skip = (int) dataInputStream.skip(i12);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i12));
                if (skip == -1) {
                    throw new EOFException(i2.g.j(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += skip;
        }
        this.f44758c += i11;
    }

    @Override
    public final int available() {
        return this.f44756a.available();
    }

    @Override
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f44758c++;
        return this.f44756a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f44758c++;
        return this.f44756a.readBoolean();
    }

    @Override
    public final byte readByte() {
        this.f44758c++;
        int read = this.f44756a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f44758c += 2;
        return this.f44756a.readChar();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f44758c += i11;
        this.f44756a.readFully(bArr, i10, i11);
    }

    @Override
    public final int readInt() {
        this.f44758c += 4;
        DataInputStream dataInputStream = this.f44756a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f44757b;
            if (byteOrder == f44754e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f44755f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f44757b);
        }
        throw new EOFException();
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() {
        long j3;
        long j10;
        this.f44758c += 8;
        DataInputStream dataInputStream = this.f44756a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f44757b;
            if (byteOrder == f44754e) {
                j3 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j10 = read;
            } else if (byteOrder == f44755f) {
                j3 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j10 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f44757b);
            }
            return j3 + j10;
        }
        throw new EOFException();
    }

    @Override
    public final short readShort() {
        this.f44758c += 2;
        DataInputStream dataInputStream = this.f44756a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f44757b;
            if (byteOrder == f44754e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f44755f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f44757b);
        }
        throw new EOFException();
    }

    @Override
    public final String readUTF() {
        this.f44758c += 2;
        return this.f44756a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f44758c++;
        return this.f44756a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.f44758c += 2;
        DataInputStream dataInputStream = this.f44756a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f44757b;
            if (byteOrder == f44754e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f44755f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f44757b);
        }
        throw new EOFException();
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(0, inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(int i10, InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f44757b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f44756a = dataInputStream;
        dataInputStream.mark(0);
        this.f44758c = 0;
        this.f44757b = byteOrder;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f44756a.read(bArr, i10, i11);
        this.f44758c += read;
        return read;
    }

    @Override
    public final void readFully(byte[] bArr) {
        this.f44758c += bArr.length;
        this.f44756a.readFully(bArr);
    }
}
