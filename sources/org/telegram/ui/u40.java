package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u40 extends org.telegram.ui.Components.w30 {
    public final y40 f44012n;

    public u40(y40 y40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        this.f44012n = y40Var;
        int i13 = org.telegram.ui.ActionBar.y6.f23402fg;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        org.telegram.ui.ActionBar.f7.y(this.containerView, this.shadowDrawable, i13, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.r30 r30Var = new org.telegram.ui.Components.r30(this, context);
        this.containerView = r30Var;
        r30Var.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setBackgroundDrawable(this.shadowDrawable);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        TextView textView = new TextView(getContext());
        if (ChatObject.isChannelOrGiga(chat)) {
            textView.setText(LocaleController.getString(R.string.VoipChannelRecordVoiceChat));
        } else {
            textView.setText(LocaleController.getString(R.string.VoipRecordVoiceChat));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        ViewGroup viewGroup2 = this.containerView;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        viewGroup2.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(LocaleController.getString(R.string.VoipRecordVoiceChatInfo));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        this.containerView.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        a5.m mVar = new a5.m(context);
        this.f34352b = mVar;
        mVar.setClipChildren(false);
        mVar.setOffscreenPageLimit(4);
        mVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(mVar, 2130706432);
        mVar.setAdapter(new org.telegram.ui.Components.v30(this));
        mVar.setPageMargin(0);
        this.containerView.addView(mVar, org.telegram.ui.Components.gb1.h(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        mVar.b(new org.telegram.ui.Components.s30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, org.telegram.ui.Components.gb1.h(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, org.telegram.ui.Components.gb1.h(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this, getContext());
        this.f34353c = t30Var;
        t30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        t30Var.setTag(-1);
        t30Var.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.y6.f23550ng;
        org.telegram.ui.ActionBar.f7.V(t30Var, i15, null);
        t30Var.setGravity(17);
        t30Var.setTypeface(AndroidUtilities.bold());
        t30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 76);
        t30Var.setForeground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
        t30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        t30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(t30Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, org.telegram.ui.Components.gb1.i(-2, 64, 80));
        int i16 = 0;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i16 >= textViewArr.length) {
                break;
            }
            textViewArr[i16] = new TextView(context);
            this.e[i16].setTextSize(1, 12.0f);
            this.e[i16].setTextColor(-1);
            this.e[i16].setTypeface(AndroidUtilities.bold());
            this.e[i16].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.e[i16].setGravity(16);
            this.e[i16].setSingleLine(true);
            this.d.addView(this.e[i16], org.telegram.ui.Components.gb1.r(-2, -1));
            if (i16 == 0) {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i16 == 1) {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i16].setOnClickListener(new ai.w(this, i16, 13));
            i16++;
        }
        if (z10) {
            this.f34352b.setCurrentItem(1);
        }
    }

    public final void n(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f22368a.I = org.telegram.ui.ActionBar.y6.f23588pg;
        v50 v50Var = this.f44012n.f45954b;
        v50Var.f44701w0 = false;
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (v50Var.f44610a1.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f22368a.T = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(v50Var.Z0)) {
            if (v50Var.f44610a1.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f22368a.T = LocaleController.getString(i12);
        } else {
            if (v50Var.f44610a1.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
        }
        alertDialog$Builder.f22368a.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.U(getContext(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23551nh, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23571oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.y6.f23550ng;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i14, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.f7.E(editTextBoldCursor, org.telegram.ui.ActionBar.y6.f23570og, null);
        org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, i14, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, org.telegram.ui.Components.gb1.x(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23402fg, false);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
        e2Var.j(x02);
        e2Var.setOnShowListener(new t40(this, e2Var, editTextBoldCursor, 1));
        e2Var.setOnDismissListener(new hz(editTextBoldCursor, 2));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new i2.z(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fz(editTextBoldCursor, 2));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23683ug, false);
        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22368a;
        e2Var2.j(x03);
        e2Var2.show();
        e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
