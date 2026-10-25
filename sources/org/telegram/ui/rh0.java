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
public final class rh0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ArrayList f43158a;
    public final ArrayList f43159b;
    public final ArrayList f43160c;
    public final org.telegram.ui.Components.m9 d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final int f43161f;
    public final boolean h;
    public final org.telegram.ui.Components.c10 f43162n;
    public boolean f43163r;
    public za1 f43164s;
    public int v;

    public rh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j10;
        this.f43158a = new ArrayList();
        this.f43159b = new ArrayList();
        this.f43160c = new ArrayList();
        this.f43161f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.f43162n = c10Var;
        c10Var.e(org.telegram.ui.ActionBar.y6.G8, org.telegram.ui.ActionBar.y6.f23446i6, -1);
        c10Var.setViewType(13);
        c10Var.setIsSingleCell(false);
        addView(c10Var, org.telegram.ui.Components.gb1.g(-1.0f, -2));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.e = b6Var;
        b6Var.setTextSize(16);
        b6Var.setEllipsizeByGradient(true);
        b6Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(b6Var, org.telegram.ui.Components.gb1.h(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.d = m9Var;
        m9Var.setStyle(11);
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(m9Var, org.telegram.ui.Components.gb1.h(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        m9Var.setAlpha(0.0f);
        b6Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new bi.d0(this, j10, i10, chat));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false);
        this.v = x02;
        setBackground(org.telegram.ui.ActionBar.y6.Z(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.mm0 a() {
        za1 za1Var = this.f43164s;
        if (za1Var != null) {
            return za1Var;
        }
        za1 za1Var2 = new za1(getContext(), 10, null);
        this.f43164s = za1Var2;
        getContext();
        za1Var2.setLayoutManager(new s4.c0());
        this.f43164s.i(new fi.p1(this, 5));
        this.f43164s.setAdapter(new bi.h5(this, 4));
        return this.f43164s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.m9 m9Var;
        String str;
        ArrayList arrayList = this.f43160c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            m9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f43161f;
            if (i10 < size) {
                m9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                m9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            m9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            m9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            m9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.b6 b6Var = this.e;
        b6Var.setRightPadding(dp);
        m9Var.a(false);
        ArrayList arrayList2 = this.f43158a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            b6Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            b6Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            b6Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        b6Var.animate().alpha(1.0f).setDuration(220L).start();
        m9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.c10 c10Var = this.f43162n;
        c10Var.animate().alpha(0.0f).setDuration(220L).setListener(new jo(c10Var)).start();
        za1 za1Var = this.f43164s;
        if (za1Var != null) {
            za1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f43163r = true;
        org.telegram.ui.Components.c10 c10Var = this.f43162n;
        if (c10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.e;
        b6Var.setVisibility(8);
        if (z10) {
            c10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            c10Var.getLayoutParams().width = getMeasuredWidth();
            c10Var.setVisibility(0);
        }
        b6Var.setVisibility(0);
        b6Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f43163r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f43163r) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false);
            if (getBackground() != null && x02 != this.v) {
                this.v = x02;
                org.telegram.ui.ActionBar.y6.E1(getBackground(), x02, true);
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
