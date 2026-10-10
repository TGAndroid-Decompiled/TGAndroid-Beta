package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class r00 extends org.telegram.ui.Components.eb {
    public final MessagesController.DialogFilter X;
    public final ArrayList Y;
    public final FrameLayout Z;
    public p00 f41278a0;
    public final TextView f41279b0;
    public final ArrayList f41280c0;
    public final ArrayList f41281d0;

    public r00(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(n2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Y = arrayList2;
        this.f41280c0 = new ArrayList();
        this.f41281d0 = new ArrayList();
        this.X = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        V(false);
        this.f25983e.setTitle(S(null));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
        TextView textView = new TextView(getContext());
        this.f41279b0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87);
        int i10 = a2.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        a2.leftMargin = i10 + i11;
        a2.rightMargin += i11;
        this.containerView.addView(textView, a2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z = frameLayout;
        this.containerView.addView(frameLayout, w7.x5.a(100.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 80));
        U();
    }

    public static void T(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, uz uzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17256id;
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new org.telegram.messenger.ma(n2Var, dialogFilter, uzVar, currentTimeMillis, 5));
    }

    @Override
    public final CharSequence B() {
        return S(null);
    }

    @Override
    public final void H(org.telegram.ui.Components.tw0 tw0Var) {
        org.telegram.ui.Components.rm0 rm0Var = this.d;
        rm0Var.setOverScrollMode(2);
        rm0Var.setOnItemClickListener(new i(this, 10));
        s4.j jVar = new s4.j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.n(350L);
        rm0Var.setItemAnimator(jVar);
    }

    public final void R() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.X;
            int size = dialogFilter.alwaysShow.size();
            n2Var = this.f25985n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && f10.g0(n2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(n2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            n2Var.presentFragment(new c00(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17256id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        n2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new m(this, 7));
    }

    public final CharSequence S(vh.n nVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.X;
        if (dialogFilter != null) {
            if (nVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = nVar.getPaint().getFontMetricsInt();
            }
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void U() {
        int i10;
        int i11;
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f41279b0.setVisibility(i10);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (arrayList.isEmpty()) {
            i11 = AndroidUtilities.dp(68.0f);
        } else {
            i11 = 0;
        }
        this.d.setPadding(dp, 0, dp2, i11);
    }

    public final void V(boolean z10) {
        ArrayList arrayList = this.f41280c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f41281d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new og.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.Y;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(w00.d(null));
            arrayList2.add(new og.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new og.a(7, false);
                aVar2.f43079m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        p00 p00Var = this.f41278a0;
        if (p00Var != null) {
            if (z10) {
                p00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qm0 x(org.telegram.ui.Components.rm0 rm0Var) {
        p00 p00Var = new p00(this);
        this.f41278a0 = p00Var;
        return p00Var;
    }
}
