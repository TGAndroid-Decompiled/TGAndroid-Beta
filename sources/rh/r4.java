package rh;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
public final class r4 implements Runnable {
    public final int f47415a;
    public final Object f47416b;
    public final Object f47417c;
    public final Object d;
    public final Object e;
    public final Object f47418f;

    public r4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f47415a = i10;
        this.f47416b = obj;
        this.f47417c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f47418f = obj5;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: rh.r4.run():void");
    }

    public r4(Object obj, Object obj2, TLObject tLObject, Object obj3, Object obj4, int i10) {
        this.f47415a = i10;
        this.f47416b = obj;
        this.f47417c = obj2;
        this.e = tLObject;
        this.d = obj3;
        this.f47418f = obj4;
    }

    public r4(th.z2 z2Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, vh.u6 u6Var) {
        this.f47415a = 8;
        this.f47416b = z2Var;
        this.d = runnable;
        this.f47417c = tL_error;
        this.e = storyItem;
        this.f47418f = u6Var;
    }

    public r4(vh.r6 r6Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.f47415a = 11;
        this.f47416b = r6Var;
        this.d = x1Var;
        this.e = tLObject;
        this.f47418f = getgroupcallstreamrtmpurl;
        this.f47417c = tL_error;
    }
}
