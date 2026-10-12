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
public final class t00 extends org.telegram.ui.Components.db {
    public final MessagesController.DialogFilter X;
    public final ArrayList Y;
    public final FrameLayout Z;
    public r00 f42035a0;
    public final TextView f42036b0;
    public final ArrayList f42037c0;
    public final ArrayList f42038d0;

    public t00(org.telegram.ui.ActionBar.m2 m2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(m2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.Y = arrayList2;
        this.f42037c0 = new ArrayList();
        this.f42038d0 = new ArrayList();
        this.X = dialogFilter;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        V(false);
        this.f25287e.setTitle(S(null));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20631h5, false));
        TextView textView = new TextView(getContext());
        this.f42036b0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.h6.Oh));
        textView.setText(LocaleController.getString(R.string.FolderLinkShareButton));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams a2 = w7.w5.a(48.0f, 16.0f, 10.0f, 16.0f, 10.0f, -1, 87);
        int i10 = a2.leftMargin;
        int i11 = this.backgroundPaddingLeft;
        a2.leftMargin = i10 + i11;
        a2.rightMargin += i11;
        this.containerView.addView(textView, a2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.Z = frameLayout;
        this.containerView.addView(frameLayout, w7.w5.a(100.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 80));
        U();
    }

    public static void T(org.telegram.ui.ActionBar.m2 m2Var, MessagesController.DialogFilter dialogFilter, wz wzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17004id;
        m2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new org.telegram.ui.Components.v80(m2Var, dialogFilter, wzVar, currentTimeMillis, 1));
    }

    @Override
    public final CharSequence A() {
        return S(null);
    }

    @Override
    public final void H(org.telegram.ui.Components.yw0 yw0Var) {
        org.telegram.ui.Components.wm0 wm0Var = this.d;
        wm0Var.setOverScrollMode(2);
        wm0Var.setOnItemClickListener(new i(this, 11));
        s4.j jVar = new s4.j();
        jVar.f47937m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.js.h);
        jVar.n(350L);
        wm0Var.setItemAnimator(jVar);
    }

    public final void R() {
        MessagesController.DialogFilter dialogFilter;
        org.telegram.ui.ActionBar.m2 m2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            dialogFilter = this.X;
            int size = dialogFilter.alwaysShow.size();
            m2Var = this.f25289n;
            if (i10 >= size) {
                break;
            }
            long longValue = dialogFilter.alwaysShow.get(i10).longValue();
            if (longValue < 0 && h10.g0(m2Var.getMessagesController().getChat(Long.valueOf(-longValue)))) {
                arrayList.add(m2Var.getMessagesController().getInputPeer(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            m2Var.presentFragment(new e00(dialogFilter, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.f17004id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        m2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new m(this, 7));
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
        this.f42036b0.setVisibility(i10);
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
        ArrayList arrayList = this.f42037c0;
        arrayList.clear();
        ArrayList arrayList2 = this.f42038d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new og.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.Y;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(y00.d(null));
            arrayList2.add(new og.a(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? aVar2 = new og.a(7, false);
                aVar2.f44233m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(aVar2);
            }
        }
        r00 r00Var = this.f42035a0;
        if (r00Var != null) {
            if (z10) {
                r00Var.E(arrayList, arrayList2);
            } else {
                this.d.getAdapter().l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.vm0 x(org.telegram.ui.Components.wm0 wm0Var) {
        r00 r00Var = new r00(this);
        this.f42035a0 = r00Var;
        return r00Var;
    }
}
