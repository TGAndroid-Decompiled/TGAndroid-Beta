package z2;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
public abstract class b {
    public static final Object f47193a = new Object();
    public static final Object f47194b = new Object();
    public static boolean f47195c;
    public static long d;

    public static long a() {
        SocketTimeoutException socketTimeoutException;
        char c10;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (f47194b) {
            }
            datagramSocket.setSoTimeout(1000);
            c();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b10 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i10], 123);
                bArr2[b10] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b10);
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                    c10 = 0;
                } else {
                    long j3 = currentTimeMillis / 1000;
                    Long.signum(j3);
                    long j10 = currentTimeMillis - (j3 * 1000);
                    socketTimeoutException = socketTimeoutException2;
                    c10 = 0;
                    long j11 = j3 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j11 >> 24);
                    bArr[41] = (byte) (j11 >> 16);
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) j11;
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j13 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b11 = bArr3[c10];
                    long e = e(24, bArr3);
                    long e7 = e(32, bArr3);
                    long e10 = e(40, bArr3);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), bArr3[1] & 255, e10);
                    long j14 = (j13 + (((e10 - j13) + (e7 - e)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j14;
                } catch (SocketTimeoutException e11) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e11;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e11);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i12 = i11 + 1;
                    if (i11 >= 10) {
                        break;
                    }
                    i10++;
                    i11 = i12;
                    b10 = 0;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void b(byte b10, byte b11, int i10, long j3) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(hc.b.j(b11, "SNTP: Untrusted mode: "));
            }
            if (i10 != 0 && i10 <= 15) {
                if (j3 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(hc.b.j(i10, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void c() {
        synchronized (f47194b) {
        }
    }

    public static long d(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long e(int i10, byte[] bArr) {
        long d10 = d(i10, bArr);
        long d11 = d(i10 + 4, bArr);
        if (d10 == 0 && d11 == 0) {
            return 0L;
        }
        return ((d11 * 1000) / 4294967296L) + ((d10 - 2208988800L) * 1000);
    }
}
