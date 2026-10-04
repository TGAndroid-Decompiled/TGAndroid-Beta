package zg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.yn;
public final class t extends FrameLayout {
    public final yn f53530a;
    public s f53531b;
    public List f53532c;
    public boolean d;
    public MessageObject f53533e;
    public final int f53534f;
    public final int h;
    public float f53535n;
    public float f53536r;
    public float f53537s;
    public long v;
    public boolean f53538w;
    public boolean f53539x;
    public final int[] f53540y;

    public t(yn ynVar, Context context) {
        super(context);
        this.f53532c = Collections.EMPTY_LIST;
        this.f53534f = 22;
        this.h = 24;
        this.f53540y = new int[2];
        setVisibility(8);
        this.f53530a = ynVar;
        setClipToPadding(false);
        setClipChildren(false);
        ynVar.f43533v0.j(new xb0(this, 24));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new r(this, 1));
            return;
        }
        this.f53539x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 27));
        duration.addListener(new pg.d0(this, 13));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages z82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f53532c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f53532c.get(0);
            if (messageObject.getGroupId() != 0 && (z82 = this.f53530a.z8(messageObject.getGroupId())) != null && (arrayList = z82.messages) != null) {
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
        if (this.d && !this.f53538w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f53538w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.t.setSelectedMessages(java.util.List):void");
    }
}
