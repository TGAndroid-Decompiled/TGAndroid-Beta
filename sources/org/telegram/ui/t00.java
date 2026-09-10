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
public final class t00 extends org.telegram.ui.Components.ab {
    public final MessagesController.DialogFilter X;
    public final ArrayList Y;
    public final FrameLayout Z;
    public r00 f36802a0;
    public final TextView f36803b0;
    public final ArrayList f36804c0;
    public final ArrayList f36805d0;

    public t00(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(p2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Y = arrayList2;
        this.f36804c0 = new ArrayList();
        this.f36805d0 = new ArrayList();
        this.X = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        U(false);
        this.e.setTitle(R(null));
        fixNavigationBar(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
        TextView textView = new TextView(getContext());
        this.f36803b0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.j6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 22));
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.containerView.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z = frameLayout;
        this.containerView.addView(frameLayout, w7.a6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        T();
    }

    public static void S(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, i10 i10Var) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f14645id;
        p2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new org.telegram.messenger.qa(p2Var, dialogFilter, i10Var, currentTimeMillis, 5));
    }

    @Override
    public final void F(org.telegram.ui.Components.aw0 aw0Var) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        vl0Var.setOverScrollMode(2);
        vl0Var.setOnItemClickListener(new i(this, 10));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.n(350L);
        vl0Var.setItemAnimator(jVar);
    }

    public final void Q() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.p2 p2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.X;
            int size = dialogFilter.alwaysShow.size();
            p2Var = this.f21452n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && h10.g0(p2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(p2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            p2Var.presentFragment(new e00(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f14645id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        p2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new m(this, 7));
    }

    public final CharSequence R(uh.o oVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        MessagesController.DialogFilter dialogFilter = this.X;
        if (dialogFilter != null) {
            if (oVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = oVar.getPaint().getFontMetricsInt();
            }
            obj = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        } else {
            obj = "";
        }
        return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, obj);
    }

    public final void T() {
        int i10;
        int i11;
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f36803b0.setVisibility(i10);
        int dp = AndroidUtilities.dp(6.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        if (arrayList.isEmpty()) {
            i11 = AndroidUtilities.dp(68.0f);
        } else {
            i11 = 0;
        }
        this.d.setPadding(dp, 0, dp2, i11);
    }

    public final void U(boolean z10) {
        ArrayList arrayList = this.f36804c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f36805d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new ng.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.Y;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(y00.d(null));
            arrayList2.add(new ng.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new ng.a(7, false);
                aVar2.f38864m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        r00 r00Var = this.f36802a0;
        if (r00Var != null) {
            if (z10) {
                r00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        r00 r00Var = new r00(this);
        this.f36802a0 = r00Var;
        return r00Var;
    }

    @Override
    public final CharSequence y() {
        return R(null);
    }
}
