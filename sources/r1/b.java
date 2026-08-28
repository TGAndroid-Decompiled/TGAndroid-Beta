package r1;

import android.util.Log;
import j3.r0;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
public class b extends InputStream implements DataInput {
    public static final ByteOrder f46969e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f46970f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream f46971a;
    public ByteOrder f46972b;
    public int f46973c;
    public byte[] d;

    public b(byte[] r2) {
        throw new UnsupportedOperationException("Method not decompiled: r1.b.<init>(byte[]):void");
    }

    public final void a(int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int i11 = i9 - i10;
            DataInputStream dataInputStream = this.f46971a;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(r0.m(i9, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f46973c += i10;
    }

    @Override
    public final int available() {
        return this.f46971a.available();
    }

    @Override
    public final void mark(int i9) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f46973c++;
        return this.f46971a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f46973c++;
        return this.f46971a.readBoolean();
    }

    @Override
    public final byte readByte() {
        this.f46973c++;
        int read = this.f46971a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f46973c += 2;
        return this.f46971a.readChar();
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
    public final void readFully(byte[] bArr, int i9, int i10) {
        this.f46973c += i10;
        this.f46971a.readFully(bArr, i9, i10);
    }

    @Override
    public final int readInt() {
        this.f46973c += 4;
        DataInputStream dataInputStream = this.f46971a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f46972b;
            if (byteOrder == f46969e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f46970f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f46972b);
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
        long j10;
        long j11;
        this.f46973c += 8;
        DataInputStream dataInputStream = this.f46971a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f46972b;
            if (byteOrder == f46969e) {
                j10 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j11 = read;
            } else if (byteOrder == f46970f) {
                j10 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j11 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f46972b);
            }
            return j10 + j11;
        }
        throw new EOFException();
    }

    @Override
    public final short readShort() {
        this.f46973c += 2;
        DataInputStream dataInputStream = this.f46971a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f46972b;
            if (byteOrder == f46969e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f46970f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f46972b);
        }
        throw new EOFException();
    }

    @Override
    public final String readUTF() {
        this.f46973c += 2;
        return this.f46971a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f46973c++;
        return this.f46971a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.f46973c += 2;
        DataInputStream dataInputStream = this.f46971a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f46972b;
            if (byteOrder == f46969e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f46970f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f46972b);
        }
        throw new EOFException();
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i9) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(0, inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(int i9, InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f46972b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f46971a = dataInputStream;
        dataInputStream.mark(0);
        this.f46973c = 0;
        this.f46972b = byteOrder;
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        int read = this.f46971a.read(bArr, i9, i10);
        this.f46973c += read;
        return read;
    }

    @Override
    public final void readFully(byte[] bArr) {
        this.f46973c += bArr.length;
        this.f46971a.readFully(bArr);
    }
}
