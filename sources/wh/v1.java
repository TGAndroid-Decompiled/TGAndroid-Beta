package wh;

import org.telegram.messenger.voip.GroupCallMessage;
public final class v1 implements Runnable {
    public final int f50093a;
    public final Object f50094b;

    public v1(Object obj, int i10) {
        this.f50093a = i10;
        this.f50094b = obj;
    }

    @Override
    public final void run() {
        switch (this.f50093a) {
            case 0:
                ((w1) this.f50094b).invalidateSelf();
                return;
            case 1:
                ((d2) this.f50094b).c();
                return;
            case 2:
                ((yg.b) this.f50094b).invalidate();
                return;
            default:
                zg.c cVar = (zg.c) this.f50094b;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.f51176a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f51177b.a(cVar.E.isSendError(), true);
                    return;
                }
                return;
        }
    }
}
