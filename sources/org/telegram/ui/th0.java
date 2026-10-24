package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class th0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList f42061a;
    public final ArrayList f42062b;
    public final ArrayList f42063c;
    public final org.telegram.ui.Components.i9 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final int f42064f;
    public final boolean h;
    public final org.telegram.ui.Components.z00 f42065n;
    public boolean f42066r;
    public wa1 f42067s;
    public int v;

    public th0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f42061a = new ArrayList();
        this.f42062b = new ArrayList();
        this.f42063c = new ArrayList();
        this.f42064f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        this.f42065n = z00Var;
        z00Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21273i6, -1);
        z00Var.setViewType(13);
        z00Var.setIsSingleCell(false);
        addView(z00Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(n5Var, w7.z5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context, false);
        this.d = i9Var;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(i9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        i9Var.setAlpha(0.0f);
        n5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.c0(this, j10, i10, chat));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
        this.v = x02;
        setBackground(org.telegram.ui.ActionBar.k6.Z(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.lm0 a() {
        wa1 wa1Var = this.f42067s;
        if (wa1Var != null) {
            return wa1Var;
        }
        wa1 wa1Var2 = new wa1(getContext(), 10, null);
        this.f42067s = wa1Var2;
        getContext();
        wa1Var2.setLayoutManager(new s4.b0());
        this.f42067s.i(new ei.q1(this, 5));
        this.f42067s.setAdapter(new ai.m5(this, 4));
        return this.f42067s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.i9 i9Var;
        String str;
        ArrayList arrayList = this.f42063c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            i9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f42064f;
            if (i10 < size) {
                i9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                i9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            i9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            i9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            i9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.n5 n5Var = this.e;
        n5Var.setRightPadding(dp);
        i9Var.a(false);
        ArrayList arrayList2 = this.f42061a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            n5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            n5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            n5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        n5Var.animate().alpha(1.0f).setDuration(220L).start();
        i9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.z00 z00Var = this.f42065n;
        z00Var.animate().alpha(0.0f).setDuration(220L).setListener(new ho(z00Var)).start();
        wa1 wa1Var = this.f42067s;
        if (wa1Var != null) {
            wa1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f42066r = true;
        org.telegram.ui.Components.z00 z00Var = this.f42065n;
        if (z00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.e;
        n5Var.setVisibility(8);
        if (z10) {
            z00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            z00Var.getLayoutParams().width = getMeasuredWidth();
            z00Var.setVisibility(0);
        }
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f42066r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f42066r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (getBackground() != null && x02 != this.v) {
                this.v = x02;
                org.telegram.ui.ActionBar.k6.E1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
