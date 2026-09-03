package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yh0 extends FrameLayout {
    public final ArrayList f40276a;
    public final ArrayList f40277b;
    public final ArrayList f40278c;
    public final org.telegram.ui.Components.d9 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final int f40279f;
    public final boolean h;
    public final org.telegram.ui.Components.u00 f40280n;
    public boolean f40281r;
    public rb1 f40282s;

    public yh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z4;
        int i11;
        long j10;
        this.f40276a = new ArrayList();
        this.f40277b = new ArrayList();
        this.f40278c = new ArrayList();
        this.f40279f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.h = z4;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.f40280n = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19971i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, k7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(k5Var, k7.b6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.d = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(d9Var, k7.b6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, k7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z4) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        d9Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new lh.u(this, j10, i10, chat));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.rl0 a() {
        rb1 rb1Var = this.f40282s;
        if (rb1Var != null) {
            return rb1Var;
        }
        rb1 rb1Var2 = new rb1(getContext(), 9, null);
        this.f40282s = rb1Var2;
        getContext();
        rb1Var2.setLayoutManager(new f2.i0());
        this.f40282s.i(new gg.e2(this, 5));
        this.f40282s.setAdapter(new eg.g(this, 4));
        return this.f40282s;
    }

    public final void b() {
        boolean z4;
        org.telegram.ui.Components.d9 d9Var;
        String str;
        ArrayList arrayList = this.f40278c;
        if (arrayList.size() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        setEnabled(z4);
        int i10 = 0;
        while (true) {
            d9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f40279f;
            if (i10 < size) {
                d9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                d9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            d9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            d9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            d9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setRightPadding(dp);
        d9Var.a(false);
        ArrayList arrayList2 = this.f40276a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            k5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        d9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.u00 u00Var = this.f40280n;
        u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.m00(u00Var)).start();
        rb1 rb1Var = this.f40282s;
        if (rb1Var != null) {
            rb1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z4 = true;
        this.f40281r = true;
        org.telegram.ui.Components.u00 u00Var = this.f40280n;
        if (u00Var.getVisibility() != 0) {
            z4 = false;
        }
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setVisibility(8);
        if (z4) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z4) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f40281r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40281r) {
            return;
        }
        super.requestLayout();
    }
}
