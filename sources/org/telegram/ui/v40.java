package org.telegram.ui;

import android.app.Activity;
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

    public final Activity f43350a;

    public final s50 f43351b;

    public v40(s50 s50Var, Activity activity) {
        this.f43351b = s50Var;
        this.f43350a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int iW0;
        s50 s50Var = this.f43351b;
        if (i10 == -1) {
            s50Var.onBackPressed();
            return;
        }
        if (i10 == 1) {
            s50Var.W0.call.join_muted = false;
            s50.F0(s50Var);
            return;
        }
        if (i10 == 2) {
            s50Var.W0.call.join_muted = true;
            s50.F0(s50Var);
            return;
        }
        if (i10 == 3) {
            s50Var.j1(false);
            return;
        }
        if (i10 == 12) {
            s50.G0(s50Var, true);
            return;
        }
        if (i10 == 13) {
            s50.G0(s50Var, false);
            return;
        }
        if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s50Var.getContext());
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new p40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.i(iW1);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23383vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false));
            return;
        }
        if (i10 == 9) {
            s50Var.f42445i1.callOnClick();
            return;
        }
        if (i10 == 5) {
            ChatObject.Call call = s50Var.W0;
            if (!call.recording) {
                r40 r40Var = new r40(this, s50Var.getContext(), s50Var.V0, s50Var.E2);
                if (s50Var.r1()) {
                    r40Var.n(2);
                    return;
                } else {
                    r40Var.show();
                    return;
                }
            }
            boolean z10 = call.call.record_video_active;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder2.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.VoipChannelStopRecordingText);
            } else {
                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.VoipGroupStopRecordingText);
            }
            alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new eh.q(8, this, z10));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.i(iW2);
            b2Var2.show();
            b2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
            return;
        }
        if (i10 == 7) {
            s50Var.f42440h0 = true;
            s50Var.f42476q1.setVisibility(0);
            s50Var.f42481r1.setVisibility(0);
            s50Var.f42449j1.setVisibility(8);
            s50Var.f42490t1.setVisibility(8);
            s50Var.f42494u1.setVisibility(8);
            s50Var.f42486s1.setVisibility(8);
            s50Var.f42464n1.setVisibility(8);
            s50Var.f42453k1.setVisibility(8);
            s50Var.f42468o1.setVisibility(8);
            s50Var.f42472p1.setVisibility(8);
            s50Var.f42436g0.setVisibility(8);
            s50Var.l1.setVisibility(8);
            s50Var.f42459m1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = s50Var.f42437g1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var == null || !n1Var.isShowing()) {
                return;
            }
            v0Var.f23854b.measure(org.telegram.messenger.rl.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
            v0Var.O(true, true);
            return;
        }
        if (i10 == 6) {
            s50Var.f42485s0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(s50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(s50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s50Var.getContext());
            alertDialog$Builder3.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
            if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f22702a.f22769u0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new iz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(s50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.g6.f23242ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = s50Var.V0;
            editTextBoldCursor.setHint(chat != null ? chat.title : "");
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23260og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new jz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new lz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(s50Var.W0.call.title)) {
                editTextBoldCursor.setText(s50Var.W0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new b7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int iW3 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23099fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
            b2Var3.i(iW3);
            b2Var3.setOnShowListener(new q40(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new kz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            editTextBoldCursor.requestFocus();
            return;
        }
        if (i10 == 8) {
            org.telegram.ui.Components.k70.v(s50Var.getContext(), -s50Var.i1(), s50Var.d, null, 2, s50Var.f42502w0, new p40(this));
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 == null) {
                return;
            }
            sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            return;
        }
        if (i10 != 10 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
        arrayList3.add(0);
        if (sharedInstance.hasEarpiece()) {
            arrayList.add(LocaleController.getString(sharedInstance.isHeadsetPlugged() ? R.string.VoipAudioRoutingHeadset : R.string.VoipAudioRoutingPhone));
            org.telegram.ui.Cells.pa.n(sharedInstance.isHeadsetPlugged() ? R.drawable.msg_voice_headphones : R.drawable.msg_voice_phone, 1, arrayList2, arrayList3);
        }
        if (sharedInstance.isBluetoothHeadsetConnected()) {
            String string = sharedInstance.currentBluetoothDeviceName;
            if (string == null) {
                string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            }
            arrayList.add(string);
            org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
        }
        int size = arrayList.size();
        CharSequence[] charSequenceArr = new CharSequence[size];
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            charSequenceArr[i12] = (CharSequence) arrayList.get(i12);
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this.f43350a, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
        e3Var.bigTitle = true;
        w wVar = new w(7, this, arrayList3);
        e3Var.items = charSequenceArr;
        e3Var.itemIcons = iArr;
        e3Var.onClickListener = wVar;
        int i13 = org.telegram.ui.ActionBar.g6.f23190kg;
        e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i14 = sharedInstance.getCurrentAudioRoute() == 1 ? 0 : sharedInstance.getCurrentAudioRoute() == 0 ? 1 : 2;
        e3Var.show();
        e3Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
        for (int i15 = 0; i15 < e3Var.getItemViews().size(); i15++) {
            org.telegram.ui.ActionBar.x2 x2Var = e3Var.getItemViews().get(i15);
            if (i15 == i14) {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false);
                x2Var.f23948f = true;
            } else {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false);
            }
            x2Var.setTextColor(iW0);
            x2Var.setIconColor(iW0);
            x2Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false), 12), 2, -1));
        }
    }
}
