package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.wn;
public final class t extends FrameLayout {
    public final wn f49438a;
    public s f49439b;
    public List f49440c;
    public boolean d;
    public MessageObject e;
    public final int f49441f;
    public final int h;
    public float f49442n;
    public float f49443r;
    public float f49444s;
    public long v;
    public boolean f49445w;
    public boolean f49446x;
    public final int[] f49447y;

    public t(wn wnVar, Context context) {
        super(context);
        this.f49440c = Collections.EMPTY_LIST;
        this.f49441f = 22;
        this.h = 24;
        this.f49447y = new int[2];
        setVisibility(8);
        this.f49438a = wnVar;
        setClipToPadding(false);
        setClipChildren(false);
        wnVar.f39694x0.j(new vg0(this, 21));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f49446x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 27));
        duration.addListener(new pg.d0(this, 13));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f49440c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f49440c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f49438a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        if (this.d && !this.f49445w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f49445w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
