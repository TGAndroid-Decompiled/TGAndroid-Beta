package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.xn;
public final class t extends FrameLayout {
    public final xn f49112a;
    public s f49113b;
    public List f49114c;
    public boolean d;
    public MessageObject e;
    public final int f49115f;
    public final int h;
    public float f49116n;
    public float f49117r;
    public float f49118s;
    public long v;
    public boolean f49119w;
    public boolean f49120x;
    public final int[] f49121y;

    public t(xn xnVar, Context context) {
        super(context);
        this.f49114c = Collections.EMPTY_LIST;
        this.f49115f = 22;
        this.h = 24;
        this.f49121y = new int[2];
        setVisibility(8);
        this.f49112a = xnVar;
        setClipToPadding(false);
        setClipChildren(false);
        xnVar.f39596x0.j(new kg0(this, 21));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f49120x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 27));
        duration.addListener(new qg.n0(this, 12));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f49114c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f49114c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f49112a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f49119w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f49119w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
