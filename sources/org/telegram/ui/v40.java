package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v40 extends org.telegram.ui.ActionBar.j {
    public final Activity f42134a;
    public final s50 f42135b;

    public v40(s50 s50Var, Activity activity) {
        this.f42135b = s50Var;
        this.f42134a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        s50 s50Var = this.f42135b;
        if (i10 == -1) {
            s50Var.onBackPressed();
        } else if (i10 == 1) {
            s50Var.f40934a1.call.join_muted = false;
            s50.G0(s50Var);
        } else if (i10 == 2) {
            s50Var.f40934a1.call.join_muted = true;
            s50.G0(s50Var);
        } else if (i10 == 3) {
            s50Var.k1(false);
        } else if (i10 == 12) {
            s50.H0(s50Var, true);
        } else if (i10 == 13) {
            s50.H0(s50Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s50Var.getContext());
            if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f20608a.I = org.telegram.ui.ActionBar.h6.f21221pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new p40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21318ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
            b2Var.i(x03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21336vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21072hg, false));
        } else if (i10 == 9) {
            s50Var.f40982m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = s50Var.f40934a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s50Var.getContext());
                alertDialog$Builder2.f20608a.I = org.telegram.ui.ActionBar.h6.f21221pg;
                alertDialog$Builder2.f20608a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                    alertDialog$Builder2.f20608a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f20608a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ci.f(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21318ug, false);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20608a;
                b2Var2.i(x04);
                b2Var2.show();
                b2Var2.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21186ng, false));
                return;
            }
            r40 r40Var = new r40(this, s50Var.getContext(), s50Var.Z0, s50Var.I2);
            if (s50Var.s1()) {
                r40Var.o(2);
            } else {
                r40Var.show();
            }
        } else if (i10 == 7) {
            s50Var.f40979l0 = true;
            s50Var.f41017u1.setVisibility(0);
            s50Var.f41021v1.setVisibility(0);
            s50Var.f40987n1.setVisibility(8);
            s50Var.f41031x1.setVisibility(8);
            s50Var.f41036y1.setVisibility(8);
            s50Var.f41026w1.setVisibility(8);
            s50Var.f41004r1.setVisibility(8);
            s50Var.f40991o1.setVisibility(8);
            s50Var.f41009s1.setVisibility(8);
            s50Var.f41013t1.setVisibility(8);
            s50Var.f40975k0.setVisibility(8);
            s50Var.f40995p1.setVisibility(8);
            s50Var.f40999q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = s50Var.f40976k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var != null && m1Var.isShowing()) {
                u0Var.f21735b.measure(org.telegram.messenger.kk.c(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                u0Var.O(true, true);
            }
        } else if (i10 == 6) {
            s50Var.f41025w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(s50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(s50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder3.f20608a.I = org.telegram.ui.ActionBar.h6.f21221pg;
            if (ChatObject.isChannelOrGiga(s50Var.Z0)) {
                alertDialog$Builder3.f20608a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f20608a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f20608a.f20691y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new hz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(s50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.h6.f21186ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = s50Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21204og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new kz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(s50Var.f40934a1.call.title)) {
                editTextBoldCursor.setText(s50Var.f40934a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20608a;
            b2Var3.i(x05);
            b2Var3.setOnShowListener(new q40(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new jz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.r80.w(s50Var.getContext(), -s50Var.j1(), s50Var.d, null, 2, s50Var.A0, new p40(this));
        } else if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            }
        } else if (i10 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = R.string.VoipAudioRoutingHeadset;
                } else {
                    i12 = R.string.VoipAudioRoutingPhone;
                }
                arrayList.add(LocaleController.getString(i12));
                if (sharedInstance.isHeadsetPlugged()) {
                    i13 = R.drawable.msg_voice_headphones;
                } else {
                    i13 = R.drawable.msg_voice_phone;
                }
                org.telegram.ui.Cells.c1.m(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.c1.m(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f42134a, (org.telegram.ui.ActionBar.d6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            mg.j jVar = new mg.j(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.h6.f21129kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21186ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21221pg, false);
                    y2Var.f21906f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21186ng, false);
                }
                y2Var.setTextColor(x02);
                y2Var.setIconColor(x02);
                y2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21072hg, false), 12), 2, -1));
            }
        }
    }
}
