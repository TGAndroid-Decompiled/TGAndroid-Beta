package u1;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
public class b extends InputStream implements DataInput {
    public static final ByteOrder f58270e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f58271f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream f58272a;
    public ByteOrder f58273b;
    public int f58274c;
    public byte[] d;

    public b(byte[] r2) {
        throw new UnsupportedOperationException("Method not decompiled: u1.b.<init>(byte[]):void");
    }

    public final void a(int i7) {
        int i10 = 0;
        while (i10 < i7) {
            int i11 = i7 - i10;
            DataInputStream dataInputStream = this.f58272a;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(i5.c.j(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f58274c += i10;
    }

    @Override
    public final int available() {
        return this.f58272a.available();
    }

    @Override
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f58274c++;
        return this.f58272a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f58274c++;
        return this.f58272a.readBoolean();
    }

    @Override
    public final byte readByte() {
        this.f58274c++;
        int read = this.f58272a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f58274c += 2;
        return this.f58272a.readChar();
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
    public final void readFully(byte[] bArr, int i7, int i10) {
        this.f58274c += i10;
        this.f58272a.readFully(bArr, i7, i10);
    }

    @Override
    public final int readInt() {
        this.f58274c += 4;
        DataInputStream dataInputStream = this.f58272a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f58273b;
            if (byteOrder == f58270e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f58271f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f58273b);
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
        this.f58274c += 8;
        DataInputStream dataInputStream = this.f58272a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f58273b;
            if (byteOrder == f58270e) {
                j3 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j10 = read;
            } else if (byteOrder == f58271f) {
                j3 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j10 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f58273b);
            }
            return j3 + j10;
        }
        throw new EOFException();
    }

    @Override
    public final short readShort() {
        this.f58274c += 2;
        DataInputStream dataInputStream = this.f58272a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f58273b;
            if (byteOrder == f58270e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f58271f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f58273b);
        }
        throw new EOFException();
    }

    @Override
    public final String readUTF() {
        this.f58274c += 2;
        return this.f58272a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f58274c++;
        return this.f58272a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.f58274c += 2;
        DataInputStream dataInputStream = this.f58272a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f58273b;
            if (byteOrder == f58270e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f58271f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f58273b);
        }
        throw new EOFException();
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(0, inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(int i7, InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f58273b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f58272a = dataInputStream;
        dataInputStream.mark(0);
        this.f58274c = 0;
        this.f58273b = byteOrder;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f58272a.read(bArr, i7, i10);
        this.f58274c += read;
        return read;
    }

    @Override
    public final void readFully(byte[] bArr) {
        this.f58274c += bArr.length;
        this.f58272a.readFully(bArr);
    }
}
