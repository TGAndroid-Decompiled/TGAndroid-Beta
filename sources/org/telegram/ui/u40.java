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
public final class u40 extends org.telegram.ui.ActionBar.k {
    public final Activity f43178a;
    public final r50 f43179b;

    public u40(r50 r50Var, Activity activity) {
        this.f43179b = r50Var;
        this.f43178a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int w02;
        int i12;
        int i13;
        String str;
        r50 r50Var = this.f43179b;
        if (i10 == -1) {
            r50Var.onBackPressed();
        } else if (i10 == 1) {
            r50Var.W0.call.join_muted = false;
            r50.F0(r50Var);
        } else if (i10 == 2) {
            r50Var.W0.call.join_muted = true;
            r50.F0(r50Var);
        } else if (i10 == 3) {
            r50Var.j1(false);
        } else if (i10 == 12) {
            r50.G0(r50Var, true);
        } else if (i10 == 13) {
            r50.G0(r50Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r50Var.getContext());
            if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f22714a.E = org.telegram.ui.ActionBar.g6.f23286pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new o40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.i(w03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393vg, false));
            }
            c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143hg, false));
        } else if (i10 == 9) {
            r50Var.f41903i1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = r50Var.W0;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r50Var.getContext());
                alertDialog$Builder2.f22714a.E = org.telegram.ui.ActionBar.g6.f23286pg;
                alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new gh.q(8, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                c2Var2.i(w04);
                c2Var2.show();
                c2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
                return;
            }
            q40 q40Var = new q40(this, r50Var.getContext(), r50Var.V0, r50Var.E2);
            if (r50Var.r1()) {
                q40Var.n(2);
            } else {
                q40Var.show();
            }
        } else if (i10 == 7) {
            r50Var.f41898h0 = true;
            r50Var.f41934q1.setVisibility(0);
            r50Var.f41939r1.setVisibility(0);
            r50Var.f41907j1.setVisibility(8);
            r50Var.f41948t1.setVisibility(8);
            r50Var.f41952u1.setVisibility(8);
            r50Var.f41944s1.setVisibility(8);
            r50Var.f41922n1.setVisibility(8);
            r50Var.f41911k1.setVisibility(8);
            r50Var.f41926o1.setVisibility(8);
            r50Var.f41930p1.setVisibility(8);
            r50Var.f41894g0.setVisibility(8);
            r50Var.l1.setVisibility(8);
            r50Var.f41917m1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = r50Var.f41895g1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var != null && o1Var.isShowing()) {
                w0Var.f23915b.measure(b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i10 == 6) {
            r50Var.f41943s0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(r50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.S(r50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(r50Var.getContext());
            alertDialog$Builder3.f22714a.E = org.telegram.ui.ActionBar.g6.f23286pg;
            if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f22714a.f22805u0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new hz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(r50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.g6.f23251ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = r50Var.V0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new kz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(r50Var.W0.call.title)) {
                editTextBoldCursor.setText(r50Var.W0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new z6(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23108fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
            c2Var3.i(w05);
            c2Var3.setOnShowListener(new p40(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new jz(1, editTextBoldCursor));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.t70.u(r50Var.getContext(), -r50Var.i1(), r50Var.d, null, 2, r50Var.f41960w0, new o40(this));
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
                b.h(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                b.h(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.f43178a, null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            ag.y1 y1Var = new ag.y1(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = y1Var;
            int i16 = org.telegram.ui.ActionBar.g6.f23198kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23286pg, false);
                    y2Var.f23981f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false);
                }
                y2Var.setTextColor(w02);
                y2Var.setIconColor(w02);
                y2Var.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143hg, false), 12), 2, -1));
            }
        }
    }
}
