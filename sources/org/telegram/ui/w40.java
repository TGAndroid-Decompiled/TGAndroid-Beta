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
public final class w40 extends org.telegram.ui.ActionBar.j {
    public final Activity f42921a;
    public final u50 f42922b;

    public w40(u50 u50Var, Activity activity) {
        this.f42922b = u50Var;
        this.f42921a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        u50 u50Var = this.f42922b;
        if (i10 == -1) {
            u50Var.onBackPressed();
        } else if (i10 == 1) {
            u50Var.f42171a1.call.join_muted = false;
            u50.F0(u50Var);
        } else if (i10 == 2) {
            u50Var.f42171a1.call.join_muted = true;
            u50.F0(u50Var);
        } else if (i10 == 3) {
            u50Var.j1(false);
        } else if (i10 == 12) {
            u50.G0(u50Var, true);
        } else if (i10 == 13) {
            u50.G0(u50Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u50Var.getContext());
            if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f20678a.I = org.telegram.ui.ActionBar.k6.f21411pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new q40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21508ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
            c2Var.j(x03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21526vg, null);
            }
            c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21262hg, false));
        } else if (i10 == 9) {
            u50Var.f42219m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = u50Var.f42171a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u50Var.getContext());
                alertDialog$Builder2.f20678a.I = org.telegram.ui.ActionBar.k6.f21411pg;
                alertDialog$Builder2.f20678a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                    alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f20678a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ci.f(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21508ug, false);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                c2Var2.j(x04);
                c2Var2.show();
                c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21376ng, false));
                return;
            }
            s40 s40Var = new s40(this, u50Var.getContext(), u50Var.Z0, u50Var.I2);
            if (u50Var.r1()) {
                s40Var.n(2);
            } else {
                s40Var.show();
            }
        } else if (i10 == 7) {
            u50Var.f42216l0 = true;
            u50Var.f42254u1.setVisibility(0);
            u50Var.f42258v1.setVisibility(0);
            u50Var.f42224n1.setVisibility(8);
            u50Var.f42268x1.setVisibility(8);
            u50Var.f42273y1.setVisibility(8);
            u50Var.f42263w1.setVisibility(8);
            u50Var.f42241r1.setVisibility(8);
            u50Var.f42228o1.setVisibility(8);
            u50Var.f42246s1.setVisibility(8);
            u50Var.f42250t1.setVisibility(8);
            u50Var.f42212k0.setVisibility(8);
            u50Var.f42232p1.setVisibility(8);
            u50Var.f42236q1.setVisibility(8);
            org.telegram.ui.ActionBar.u0 u0Var = u50Var.f42213k1;
            org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
            if (m1Var != null && m1Var.isShowing()) {
                u0Var.f21874b.measure(org.telegram.messenger.sl.c(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                u0Var.O(true, true);
            }
        } else if (i10 == 6) {
            u50Var.f42262w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(u50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.T(u50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(u50Var.getContext());
            alertDialog$Builder3.f20678a.I = org.telegram.ui.ActionBar.k6.f21411pg;
            if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                alertDialog$Builder3.f20678a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f20678a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f20678a.A0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new iz(editTextBoldCursor, 1));
            LinearLayout linearLayout = new LinearLayout(u50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.o(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.k6.f21376ng;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i14, null);
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = u50Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            org.telegram.ui.ActionBar.r6.F(editTextBoldCursor, org.telegram.ui.ActionBar.k6.f21394og, null);
            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i14, null);
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new lz(editTextBoldCursor, 1));
            if (!TextUtils.isEmpty(u50Var.f42171a1.call.title)) {
                editTextBoldCursor.setText(u50Var.f42171a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new e7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20678a;
            c2Var3.j(x05);
            c2Var3.setOnShowListener(new r40(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new kz(editTextBoldCursor, 1));
            c2Var3.show();
            c2Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.s80.v(u50Var.getContext(), -u50Var.i1(), u50Var.d, null, 2, u50Var.A0, new q40(this));
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
                org.telegram.ui.Cells.b1.n(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.b1.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) this.f42921a, (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            h3Var.bigTitle = true;
            mg.j jVar = new mg.j(8, this, arrayList3);
            h3Var.items = charSequenceArr;
            h3Var.itemIcons = iArr;
            h3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.k6.f21319kg;
            h3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
            h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.x0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            h3Var.show();
            h3Var.setTitleColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21376ng, false));
            for (int i17 = 0; i17 < h3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.z2 z2Var = h3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21411pg, false);
                    z2Var.f22021f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21376ng, false);
                }
                z2Var.setTextColor(x02);
                z2Var.setIconColor(x02);
                int i18 = org.telegram.ui.ActionBar.k6.f21262hg;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i18, false), 12), 2, -1);
                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i18, 12);
                z2Var.setBackground(g02);
                org.telegram.ui.ActionBar.r6.k(z2Var, g02, null, h, null);
            }
        }
    }
}
