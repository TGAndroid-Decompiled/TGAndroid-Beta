package r1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b extends InputStream implements DataInput {

    public static final ByteOrder f46659e = ByteOrder.LITTLE_ENDIAN;

    public static final ByteOrder f46660f = ByteOrder.BIG_ENDIAN;

    public final DataInputStream f46661a;

    public ByteOrder f46662b;

    public int f46663c;
    public byte[] d;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(0, byteArrayInputStream);
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.f46661a;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.d, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(i0.a.l(i10, "Reached EOF while skipping ", " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.f46663c += i11;
    }

    @Override
    public final int available() {
        return this.f46661a.available();
    }

    @Override
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f46663c++;
        return this.f46661a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f46663c++;
        return this.f46661a.readBoolean();
    }

    @Override
    public final byte readByte() throws IOException {
        this.f46663c++;
        int i10 = this.f46661a.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f46663c += 2;
        return this.f46661a.readChar();
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
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f46663c += i11;
        this.f46661a.readFully(bArr, i10, i11);
    }

    @Override
    public final int readInt() throws IOException {
        this.f46663c += 4;
        DataInputStream dataInputStream = this.f46661a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f46662b;
        if (byteOrder == f46659e) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == f46660f) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.f46662b);
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() throws IOException {
        long j10;
        long j11;
        this.f46663c += 8;
        DataInputStream dataInputStream = this.f46661a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f46662b;
        if (byteOrder == f46659e) {
            j10 = (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8);
            j11 = i10;
        } else {
            if (byteOrder != f46660f) {
                throw new IOException("Invalid byte order: " + this.f46662b);
            }
            j10 = (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8);
            j11 = i17;
        }
        return j10 + j11;
    }

    @Override
    public final short readShort() throws IOException {
        this.f46663c += 2;
        DataInputStream dataInputStream = this.f46661a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f46662b;
        if (byteOrder == f46659e) {
            return (short) ((i11 << 8) + i10);
        }
        if (byteOrder == f46660f) {
            return (short) ((i10 << 8) + i11);
        }
        throw new IOException("Invalid byte order: " + this.f46662b);
    }

    @Override
    public final String readUTF() {
        this.f46663c += 2;
        return this.f46661a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f46663c++;
        return this.f46661a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() throws IOException {
        this.f46663c += 2;
        DataInputStream dataInputStream = this.f46661a;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f46662b;
        if (byteOrder == f46659e) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == f46660f) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.f46662b);
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
        this.f46662b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f46661a = dataInputStream;
        dataInputStream.mark(0);
        this.f46663c = 0;
        this.f46662b = byteOrder;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f46661a.read(bArr, i10, i11);
        this.f46663c += i12;
        return i12;
    }

    @Override
    public final void readFully(byte[] bArr) throws IOException {
        this.f46663c += bArr.length;
        this.f46661a.readFully(bArr);
    }
}
