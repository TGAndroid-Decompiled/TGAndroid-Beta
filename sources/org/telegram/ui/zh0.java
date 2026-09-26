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
public final class zh0 extends FrameLayout {
    public final ArrayList f40492a;
    public final ArrayList f40493b;
    public final ArrayList f40494c;
    public final org.telegram.ui.Components.k9 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final int f40495f;
    public final boolean h;
    public final org.telegram.ui.Components.v00 f40496n;
    public boolean f40497r;
    public wb1 f40498s;

    public zh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f40492a = new ArrayList();
        this.f40493b = new ArrayList();
        this.f40494c = new ArrayList();
        this.f40495f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        this.f40496n = v00Var;
        v00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19148i6, -1);
        v00Var.setViewType(13);
        v00Var.setIsSingleCell(false);
        addView(v00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, w7.y5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.d = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.y5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.y5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        k9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.k8(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.xl0 a() {
        wb1 wb1Var = this.f40498s;
        if (wb1Var != null) {
            return wb1Var;
        }
        wb1 wb1Var2 = new wb1(getContext(), 10, null);
        this.f40498s = wb1Var2;
        getContext();
        wb1Var2.setLayoutManager(new s4.c0());
        this.f40498s.i(new ci.r1(this, 5));
        this.f40498s.setAdapter(new gg.n0(this, 3));
        return this.f40498s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.k9 k9Var;
        String str;
        ArrayList arrayList = this.f40494c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            k9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f40495f;
            if (i10 < size) {
                k9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                k9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            k9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            k9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            k9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setRightPadding(dp);
        k9Var.a(false);
        ArrayList arrayList2 = this.f40492a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            h5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            h5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            h5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        h5Var.animate().alpha(1.0f).setDuration(220L).start();
        k9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.v00 v00Var = this.f40496n;
        v00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.ca(v00Var)).start();
        wb1 wb1Var = this.f40498s;
        if (wb1Var != null) {
            wb1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f40497r = true;
        org.telegram.ui.Components.v00 v00Var = this.f40496n;
        if (v00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.e;
        h5Var.setVisibility(8);
        if (z10) {
            v00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            v00Var.getLayoutParams().width = getMeasuredWidth();
            v00Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f40497r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f40497r) {
            return;
        }
        super.requestLayout();
    }
}
