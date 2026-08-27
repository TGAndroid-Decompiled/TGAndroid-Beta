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

public final class rh0 extends FrameLayout {

    public final ArrayList f41933a;

    public final ArrayList f41934b;

    public final ArrayList f41935c;
    public final org.telegram.ui.Components.b9 d;

    public final org.telegram.ui.ActionBar.h5 f41936e;

    public final int f41937f;
    public final boolean h;

    public final org.telegram.ui.Components.h00 f41938n;

    public boolean f41939r;

    public ta1 f41940s;

    public rh0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.f41933a = new ArrayList();
        this.f41934b = new ArrayList();
        this.f41935c = new ArrayList();
        this.f41937f = i10;
        boolean z10 = messageObject.isRoundVideo() || messageObject.isVoice();
        this.h = z10;
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        this.f41938n = h00Var;
        h00Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f23144i6, -1);
        h00Var.setViewType(13);
        h00Var.setIsSingleCell(false);
        addView(h00Var, h7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41936e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, h7.z5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(context, false);
        this.d = b9Var;
        b9Var.setStyle(11);
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(b9Var, h7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, h7.z5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        b9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new hh.v(this, peer != null ? peer.user_id : 0L, i10, chat));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.zk0 a() {
        ta1 ta1Var = this.f41940s;
        if (ta1Var != null) {
            return ta1Var;
        }
        ta1 ta1Var2 = new ta1(getContext(), 9, null);
        this.f41940s = ta1Var2;
        getContext();
        ta1Var2.setLayoutManager(new f2.k0());
        this.f41940s.i(new cg.h2(this, 6));
        this.f41940s.setAdapter(new ag.i(this, 4));
        return this.f41940s;
    }

    public final void b() {
        org.telegram.ui.Components.b9 b9Var;
        ArrayList arrayList = this.f41935c;
        setEnabled(arrayList.size() > 0);
        int i10 = 0;
        while (true) {
            b9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f41937f;
            if (i10 < size) {
                b9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                b9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            b9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            b9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            b9Var.setTranslationX(0.0f);
        }
        int iDp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.f41936e;
        h5Var.setRightPadding(iDp);
        b9Var.a(false);
        ArrayList arrayList2 = this.f41933a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            h5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            h5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            h5Var.l(LocaleController.formatPluralString(this.h ? "MessagePlayed" : "MessageSeen", arrayList2.size(), new Object[0]), false);
        }
        h5Var.animate().alpha(1.0f).setDuration(220L).start();
        b9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.h00 h00Var = this.f41938n;
        h00Var.animate().alpha(0.0f).setDuration(220L).setListener(new go(h00Var)).start();
        ta1 ta1Var = this.f41940s;
        if (ta1Var != null) {
            ta1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.f41939r = true;
        org.telegram.ui.Components.h00 h00Var = this.f41938n;
        boolean z10 = h00Var.getVisibility() == 0;
        org.telegram.ui.ActionBar.h5 h5Var = this.f41936e;
        h5Var.setVisibility(8);
        if (z10) {
            h00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            h00Var.getLayoutParams().width = getMeasuredWidth();
            h00Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f41939r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f41939r) {
            return;
        }
        super.requestLayout();
    }
}
