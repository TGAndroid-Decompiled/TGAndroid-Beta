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
public final class r40 extends org.telegram.ui.ActionBar.j {
    public final Activity f42264a;
    public final o50 f42265b;

    public r40(o50 o50Var, Activity activity) {
        this.f42265b = o50Var;
        this.f42264a = activity;
    }

    @Override
    public final void b(int i9) {
        VoIPService sharedInstance;
        int i10;
        int w02;
        int i11;
        int i12;
        String str;
        o50 o50Var = this.f42265b;
        if (i9 == -1) {
            o50Var.onBackPressed();
        } else if (i9 == 1) {
            o50Var.W0.call.join_muted = false;
            o50.E0(o50Var);
        } else if (i9 == 2) {
            o50Var.W0.call.join_muted = true;
            o50.E0(o50Var);
        } else if (i9 == 3) {
            o50Var.j1(false);
        } else if (i9 == 12) {
            o50.F0(o50Var, true);
        } else if (i9 == 13) {
            o50.F0(o50Var, false);
        } else if (i9 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o50Var.getContext());
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.f6.f23220pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new l40(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23313ug, false);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.i(w03);
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23326vg, false));
            }
            c2Var.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false));
        } else if (i9 == 9) {
            o50Var.f40916i1.callOnClick();
        } else if (i9 == 5) {
            ChatObject.Call call = o50Var.W0;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o50Var.getContext());
                alertDialog$Builder2.f22702a.E = org.telegram.ui.ActionBar.f6.f23220pg;
                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new dh.s(8, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23313ug, false);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                c2Var2.i(w04);
                c2Var2.show();
                c2Var2.o(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
                return;
            }
            n40 n40Var = new n40(this, o50Var.getContext(), o50Var.V0, o50Var.E2);
            if (o50Var.r1()) {
                n40Var.n(2);
            } else {
                n40Var.show();
            }
        } else if (i9 == 7) {
            o50Var.f40911h0 = true;
            o50Var.f40947q1.setVisibility(0);
            o50Var.f40952r1.setVisibility(0);
            o50Var.f40920j1.setVisibility(8);
            o50Var.f40961t1.setVisibility(8);
            o50Var.f40965u1.setVisibility(8);
            o50Var.f40957s1.setVisibility(8);
            o50Var.f40935n1.setVisibility(8);
            o50Var.f40924k1.setVisibility(8);
            o50Var.f40939o1.setVisibility(8);
            o50Var.f40943p1.setVisibility(8);
            o50Var.f40907g0.setVisibility(8);
            o50Var.l1.setVisibility(8);
            o50Var.f40930m1.setVisibility(8);
            org.telegram.ui.ActionBar.w0 w0Var = o50Var.f40908g1;
            org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
            if (o1Var != null && o1Var.isShowing()) {
                w0Var.f23901b.measure(org.telegram.messenger.ll.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                w0Var.O(true, true);
            }
        } else if (i9 == 6) {
            o50Var.f40956s0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(o50Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.S(o50Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(o50Var.getContext());
            alertDialog$Builder3.f22702a.E = org.telegram.ui.ActionBar.f6.f23220pg;
            if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f22702a.f22788u0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new fz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(o50Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i13 = org.telegram.ui.ActionBar.f6.f23188ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = o50Var.V0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23203og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new gz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new iz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(o50Var.W0.call.title)) {
                editTextBoldCursor.setText(o50Var.W0.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23046fg, false);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
            c2Var3.i(w05);
            c2Var3.setOnShowListener(new m40(this, c2Var3, editTextBoldCursor, 0));
            c2Var3.setOnDismissListener(new hz(1, editTextBoldCursor));
            c2Var3.show();
            c2Var3.o(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            editTextBoldCursor.requestFocus();
        } else if (i9 == 8) {
            org.telegram.ui.Components.g70.u(o50Var.getContext(), -o50Var.i1(), o50Var.d, null, 2, o50Var.f40973w0, new l40(this));
        } else if (i9 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            }
        } else if (i9 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i11 = R.string.VoipAudioRoutingHeadset;
                } else {
                    i11 = R.string.VoipAudioRoutingPhone;
                }
                arrayList.add(LocaleController.getString(i11));
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = R.drawable.msg_voice_headphones;
                } else {
                    i12 = R.drawable.msg_voice_phone;
                }
                org.telegram.ui.Cells.j2.j(i12, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.j2.j(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i14 = 0; i14 < size; i14++) {
                charSequenceArr[i14] = (CharSequence) arrayList.get(i14);
                iArr[i14] = ((Integer) arrayList2.get(i14)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(this.f42264a, null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            v vVar = new v(7, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = vVar;
            int i15 = org.telegram.ui.ActionBar.f6.f23136kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i10 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
            for (int i16 = 0; i16 < f3Var.getItemViews().size(); i16++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i16);
                if (i16 == i10) {
                    w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23220pg, false);
                    y2Var.f23976f = true;
                } else {
                    w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false);
                }
                y2Var.setTextColor(w02);
                y2Var.setIconColor(w02);
                y2Var.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false), 12), 2, -1));
            }
        }
    }
}
