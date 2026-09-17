package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.bo;
public final class t extends FrameLayout {
    public final bo f49191a;
    public s f49192b;
    public List f49193c;
    public boolean d;
    public MessageObject e;
    public final int f49194f;
    public final int h;
    public float f49195n;
    public float f49196r;
    public float f49197s;
    public long v;
    public boolean f49198w;
    public boolean f49199x;
    public final int[] f49200y;

    public t(bo boVar, Context context) {
        super(context);
        this.f49193c = Collections.EMPTY_LIST;
        this.f49194f = 22;
        this.h = 24;
        this.f49200y = new int[2];
        setVisibility(8);
        this.f49191a = boVar;
        setClipToPadding(false);
        setClipChildren(false);
        boVar.f32502x0.j(new kb0(this, 23));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f49199x = false;
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
        if (this.d && !this.f49193c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f49193c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f49191a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        if (this.d && !this.f49198w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f49198w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
