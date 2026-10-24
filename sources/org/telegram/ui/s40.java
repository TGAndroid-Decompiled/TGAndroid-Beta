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
public final class s40 extends org.telegram.ui.Components.s30 {
    public final w40 f41296n;

    public s40(w40 w40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, false);
        int i10;
        int i11;
        int i12;
        this.f41296n = w40Var;
        int i13 = org.telegram.ui.ActionBar.k6.fg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
        org.telegram.ui.ActionBar.r6.z(this.containerView, this.shadowDrawable, i13, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.n30 n30Var = new org.telegram.ui.Components.n30(this, context);
        this.containerView = n30Var;
        n30Var.setWillNotDraw(false);
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
        viewGroup2.addView(textView, w7.z5.d(-2, -2.0f, i11 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
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
        this.containerView.addView(textView2, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.e = new TextView[3];
        z4.h hVar = new z4.h(context);
        this.f30429b = hVar;
        hVar.setClipChildren(false);
        hVar.setOffscreenPageLimit(4);
        hVar.setClipToPadding(false);
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new org.telegram.ui.Components.r30(this));
        hVar.setPageMargin(0);
        this.containerView.addView(hVar, w7.z5.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        hVar.b(new org.telegram.ui.Components.o30(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{x02, 0}));
        this.containerView.addView(view, w7.z5.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, x02}));
        this.containerView.addView(view2, w7.z5.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        org.telegram.ui.Components.p30 p30Var = new org.telegram.ui.Components.p30(this, getContext());
        this.f30430c = p30Var;
        p30Var.setMinWidth(AndroidUtilities.dp(64.0f));
        p30Var.setTag(-1);
        p30Var.setTextSize(1, 14.0f);
        int i15 = org.telegram.ui.ActionBar.k6.f21377ng;
        org.telegram.ui.ActionBar.r6.W(p30Var, i15, null);
        p30Var.setGravity(17);
        p30Var.setTypeface(AndroidUtilities.bold());
        p30Var.setText(LocaleController.getString(R.string.VoipRecordStart));
        int dp = AndroidUtilities.dp(6.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 76);
        p30Var.setForeground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
        p30Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        p30Var.setOnClickListener(new org.telegram.ui.Components.f0(this, 22));
        this.containerView.addView(p30Var, w7.z5.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        this.containerView.addView(linearLayout, w7.z5.e(-2, 64, 80));
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
            this.d.addView(this.e[i16], w7.z5.n(-2, -1));
            if (i16 == 0) {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordAudio));
            } else if (i16 == 1) {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordPortrait));
            } else {
                this.e[i16].setText(LocaleController.getString(R.string.VoipRecordLandscape));
            }
            this.e[i16].setOnClickListener(new ai.n1(this, i16, 11));
            i16++;
        }
        if (z10) {
            this.f30429b.setCurrentItem(1);
        }
    }

    public final void n(int i10) {
        int i11;
        int i12;
        int i13;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f20679a.I = org.telegram.ui.ActionBar.k6.f21412pg;
        u50 u50Var = this.f41296n.f42898b;
        u50Var.f42308w0 = false;
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            if (u50Var.f42217a1.call.rtmp_stream) {
                i13 = R.string.VoipGroupStartRecordingRtmpText;
            } else {
                i13 = R.string.VoipGroupStartRecordingText;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i13);
        } else if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
            if (u50Var.f42217a1.call.rtmp_stream) {
                i12 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i12 = R.string.VoipChannelStartRecordingVideoText;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i12);
        } else {
            if (u50Var.f42217a1.call.rtmp_stream) {
                i11 = R.string.VoipGroupStartRecordingRtmpVideoText;
            } else {
                i11 = R.string.VoipGroupStartRecordingVideoText;
            }
            alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
        }
        alertDialog$Builder.f20679a.A0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U(getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21378nh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21396oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f21377ng;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i14, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21395og, null);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i14, null);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder, 2));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.j(x02);
        c2Var.setOnShowListener(new r40(this, c2Var, editTextBoldCursor, 1));
        c2Var.setOnDismissListener(new kz(editTextBoldCursor, 2));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new hg.b2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new iz(editTextBoldCursor, 2));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21509ug, false);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
        c2Var2.j(x03);
        c2Var2.show();
        c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        editTextBoldCursor.requestFocus();
    }
}
