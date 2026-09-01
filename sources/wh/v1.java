package wh;

import org.telegram.messenger.voip.GroupCallMessage;
public final class v1 implements Runnable {
    public final int f50094a;
    public final Object f50095b;

    public v1(Object obj, int i10) {
        this.f50094a = i10;
        this.f50095b = obj;
    }

    @Override
    public final void run() {
        switch (this.f50094a) {
            case 0:
                ((w1) this.f50095b).invalidateSelf();
                return;
            case 1:
                ((d2) this.f50095b).c();
                return;
            case 2:
                ((yg.b) this.f50095b).invalidate();
                return;
            default:
                zg.c cVar = (zg.c) this.f50095b;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.f51177a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f51178b.a(cVar.E.isSendError(), true);
                    return;
                }
                return;
        }
    }
}
