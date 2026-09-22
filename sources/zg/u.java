package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.zn;
public final class u extends FrameLayout {
    public final zn f49489a;
    public s f49490b;
    public List f49491c;
    public boolean d;
    public MessageObject e;
    public final int f49492f;
    public final int h;
    public float f49493n;
    public float f49494r;
    public float f49495s;
    public long v;
    public boolean f49496w;
    public boolean f49497x;
    public final int[] f49498y;

    public u(zn znVar, Context context) {
        super(context);
        this.f49491c = Collections.EMPTY_LIST;
        this.f49492f = 22;
        this.h = 24;
        this.f49498y = new int[2];
        setVisibility(8);
        this.f49489a = znVar;
        setClipToPadding(false);
        setClipChildren(false);
        znVar.f40551x0.j(new vb0(this, 23));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f49497x = false;
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
        if (this.d && !this.f49491c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f49491c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f49489a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: zg.u.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f49496w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f49496w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.u.setSelectedMessages(java.util.List):void");
    }
}
