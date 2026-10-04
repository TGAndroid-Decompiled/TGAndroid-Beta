package r1;

import android.util.Log;
import hg.k0;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
public class b extends InputStream implements DataInput {
    public static final ByteOrder f45652e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f45653f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream f45654a;
    public ByteOrder f45655b;
    public int f45656c;
    public byte[] d;

    public b(byte[] r2) {
        throw new UnsupportedOperationException("Method not decompiled: r1.b.<init>(byte[]):void");
    }

    public final void a(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f45654a;
            int skip = (int) dataInputStream.skip(i12);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i12));
                if (skip == -1) {
                    throw new EOFException(k0.i(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += skip;
        }
        this.f45656c += i11;
    }

    @Override
    public final int available() {
        return this.f45654a.available();
    }

    @Override
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f45656c++;
        return this.f45654a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f45656c++;
        return this.f45654a.readBoolean();
    }

    @Override
    public final byte readByte() {
        this.f45656c++;
        int read = this.f45654a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f45656c += 2;
        return this.f45654a.readChar();
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
        this.f45656c += i11;
        this.f45654a.readFully(bArr, i10, i11);
    }

    @Override
    public final int readInt() {
        this.f45656c += 4;
        DataInputStream dataInputStream = this.f45654a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f45655b;
            if (byteOrder == f45652e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f45653f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f45655b);
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
        this.f45656c += 8;
        DataInputStream dataInputStream = this.f45654a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f45655b;
            if (byteOrder == f45652e) {
                j3 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j10 = read;
            } else if (byteOrder == f45653f) {
                j3 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j10 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f45655b);
            }
            return j3 + j10;
        }
        throw new EOFException();
    }

    @Override
    public final short readShort() {
        this.f45656c += 2;
        DataInputStream dataInputStream = this.f45654a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f45655b;
            if (byteOrder == f45652e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f45653f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f45655b);
        }
        throw new EOFException();
    }

    @Override
    public final String readUTF() {
        this.f45656c += 2;
        return this.f45654a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f45656c++;
        return this.f45654a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.f45656c += 2;
        DataInputStream dataInputStream = this.f45654a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f45655b;
            if (byteOrder == f45652e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f45653f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f45655b);
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
        this.f45655b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f45654a = dataInputStream;
        dataInputStream.mark(0);
        this.f45656c = 0;
        this.f45655b = byteOrder;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f45654a.read(bArr, i10, i11);
        this.f45656c += read;
        return read;
    }

    @Override
    public final void readFully(byte[] bArr) {
        this.f45656c += bArr.length;
        this.f45654a.readFully(bArr);
    }
}
