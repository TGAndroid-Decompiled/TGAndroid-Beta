package z9;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
public final class e {
    public static final String f60173b = g.i(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong f60174c = new AtomicLong(0);
    public final String f60175a;

    public e() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b10 = array[0];
        byte b11 = array[1];
        byte b12 = array[2];
        byte b13 = array[3];
        byte[] a10 = a(time % 1000);
        byte b14 = a10[0];
        byte b15 = a10[1];
        byte[] a11 = a(f60174c.incrementAndGet());
        byte b16 = a11[0];
        byte b17 = a11[1];
        byte[] a12 = a(Integer.valueOf(Process.myPid()).shortValue());
        String f10 = g.f(new byte[]{b10, b11, b12, b13, b14, b15, b16, b17, a12[0], a12[1]});
        Locale locale = Locale.US;
        this.f60175a = String.format(locale, "%s%s%s%s", f10.substring(0, 12), f10.substring(12, 16), f10.subSequence(16, 20), f60173b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.f60175a;
    }
}
