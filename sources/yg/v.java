package yg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.al0;
import org.telegram.ui.eo;
public final class v extends FrameLayout {
    public final eo f47147a;
    public u f47148b;
    public List f47149c;
    public boolean d;
    public MessageObject e;
    public final int f47150f;
    public final int h;
    public float f47151n;
    public float f47152r;
    public float f47153s;
    public long v;
    public boolean f47154w;
    public boolean f47155x;
    public final int[] f47156y;

    public v(eo eoVar, Context context) {
        super(context);
        this.f47149c = Collections.EMPTY_LIST;
        this.f47150f = 22;
        this.h = 24;
        this.f47156y = new int[2];
        setVisibility(8);
        this.f47147a = eoVar;
        setClipToPadding(false);
        setClipChildren(false);
        eoVar.f32542x0.j(new al0(this, 19));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new t(this, 1));
            return;
        }
        this.f47155x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new qg.o(this, 13));
        duration.addListener(new b(this, 1));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages y82;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f47149c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f47149c.get(0);
            if (messageObject.getGroupId() != 0 && (y82 = this.f47147a.y8(messageObject.getGroupId())) != null && (arrayList = y82.messages) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: yg.v.c(boolean):void");
    }

    public final boolean d() {
        if (this.d && !this.f47154w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f47154w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r11) {
        throw new UnsupportedOperationException("Method not decompiled: yg.v.setSelectedMessages(java.util.List):void");
    }
}
