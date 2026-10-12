package qi;

import org.telegram.messenger.AndroidUtilities;
public final class f implements Runnable {
    public final int f43665a;
    public final i f43666b;

    public f(i iVar, int i10) {
        this.f43665a = i10;
        this.f43666b = iVar;
    }

    private final void a() {
        i iVar = this.f43666b;
        iVar.e();
        synchronized (iVar.f43672a) {
            try {
                if (iVar.f43689u) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new f(iVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: qi.f.run():void");
    }
}
