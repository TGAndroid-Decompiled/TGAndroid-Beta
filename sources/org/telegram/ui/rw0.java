package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
public final class rw0 extends fg.i {
    public final Context V;
    public final vw0 W;

    public rw0(vw0 vw0Var, Context context, int i10, int i11, Context context2) {
        super(context, i10, i11);
        this.W = vw0Var;
        this.V = context2;
    }

    @Override
    public final void g() {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        float f11;
        int i14;
        int i15;
        float f12;
        int i16;
        int i17;
        float f13;
        int i18;
        vw0 vw0Var = this.W;
        PremiumPreviewFragment premiumPreviewFragment = vw0Var.f39214n;
        if (premiumPreviewFragment.f31943o0 == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            Context context = this.V;
            premiumPreviewFragment.f31943o0 = new FrameLayout(context);
            ScrollView scrollView = new ScrollView(context);
            fg.a aVar = vw0Var.d.f6156b;
            dg.u3 u3Var = new dg.u3(context, 8);
            u3Var.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText("Spectral top ");
            int i19 = org.telegram.ui.ActionBar.j6.f20059n5;
            b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            textView.setGravity(i10 | 48);
            if (LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 5;
            }
            u3Var.addView(textView, k7.b6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(context);
            jo0Var.setDelegate(new g20(aVar, 0));
            fg.j jVar = aVar.f6119c;
            if (jVar == null) {
                f10 = 0.0f;
            } else {
                f10 = jVar.v / 2.0f;
            }
            jo0Var.setProgress(f10);
            jo0Var.setReportChanges(true);
            u3Var.addView(jo0Var, k7.b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setText("Spectral bottom ");
            b.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 16.0f, 1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            textView2.setGravity(i12 | 48);
            if (LocaleController.isRTL) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            u3Var.addView(textView2, k7.b6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.jo0 jo0Var2 = new org.telegram.ui.Components.jo0(context);
            jo0Var2.setDelegate(new g20(aVar, 1));
            fg.j jVar2 = aVar.f6119c;
            if (jVar2 == null) {
                f11 = 0.0f;
            } else {
                f11 = jVar2.f6187w / 2.0f;
            }
            jo0Var2.setProgress(f11);
            jo0Var2.setReportChanges(true);
            u3Var.addView(jo0Var2, k7.b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView3 = new TextView(context);
            textView3.setText("Setup spec color");
            textView3.setTextSize(1, 16.0f);
            textView3.setLines(1);
            textView3.setGravity(17);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            int i20 = org.telegram.ui.ActionBar.j6.Sh;
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            int i21 = org.telegram.ui.ActionBar.j6.Oh;
            textView3.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i21, false)));
            textView3.setOnClickListener(new h20(context, aVar, 0));
            u3Var.addView(textView3, k7.b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setText("Diffuse ");
            b.q(textView4, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 16.0f, 1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            if (LocaleController.isRTL) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            textView4.setGravity(i14 | 48);
            if (LocaleController.isRTL) {
                i15 = 3;
            } else {
                i15 = 5;
            }
            u3Var.addView(textView4, k7.b6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.jo0 jo0Var3 = new org.telegram.ui.Components.jo0(context);
            jo0Var3.setDelegate(new g20(aVar, 2));
            fg.j jVar3 = aVar.f6119c;
            if (jVar3 == null) {
                f12 = 0.0f;
            } else {
                f12 = jVar3.f6188x;
            }
            jo0Var3.setProgress(f12);
            jo0Var3.setReportChanges(true);
            u3Var.addView(jo0Var3, k7.b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView5 = new TextView(context);
            textView5.setText("Normal map spectral");
            b.q(textView5, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 16.0f, 1);
            textView5.setMaxLines(1);
            textView5.setSingleLine(true);
            if (LocaleController.isRTL) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            textView5.setGravity(i16 | 48);
            if (LocaleController.isRTL) {
                i17 = 3;
            } else {
                i17 = 5;
            }
            u3Var.addView(textView5, k7.b6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.jo0 jo0Var4 = new org.telegram.ui.Components.jo0(context);
            int i22 = 3;
            jo0Var4.setDelegate(new g20(aVar, 3));
            fg.j jVar4 = aVar.f6119c;
            if (jVar4 == null) {
                f13 = 0.0f;
            } else {
                f13 = jVar4.A / 2.0f;
            }
            jo0Var4.setProgress(f13);
            jo0Var4.setReportChanges(true);
            u3Var.addView(jo0Var4, k7.b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            TextView textView6 = new TextView(context);
            textView6.setText("Setup normal spec color");
            textView6.setTextSize(1, 16.0f);
            textView6.setLines(1);
            textView6.setGravity(17);
            textView6.setMaxLines(1);
            textView6.setSingleLine(true);
            textView6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
            textView6.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.w0(null, i21, false)));
            textView6.setOnClickListener(new h20(context, aVar, 1));
            u3Var.addView(textView6, k7.b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            TextView textView7 = new TextView(context);
            textView7.setText("Small starts size");
            b.q(textView7, org.telegram.ui.ActionBar.j6.w0(null, i19, false), 1, 16.0f, 1);
            textView7.setMaxLines(1);
            textView7.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 3;
            } else {
                i18 = 5;
            }
            textView7.setGravity(i18 | 48);
            if (!LocaleController.isRTL) {
                i22 = 5;
            }
            u3Var.addView(textView7, k7.b6.d(-2, -1.0f, i22 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
            org.telegram.ui.Components.jo0 jo0Var5 = new org.telegram.ui.Components.jo0(context);
            jo0Var5.setDelegate(new z9.d(16));
            jo0Var5.setProgress(dg.u3.f4818b / 2.0f);
            jo0Var5.setReportChanges(true);
            u3Var.addView(jo0Var5, k7.b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
            scrollView.addView(u3Var);
            premiumPreviewFragment.f31943o0.addView(scrollView);
            premiumPreviewFragment.f31943o0.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
            premiumPreviewFragment.f31926a0.addView(premiumPreviewFragment.f31943o0, k7.b6.e(-1, -1, 80));
            ((ViewGroup.MarginLayoutParams) premiumPreviewFragment.f31943o0.getLayoutParams()).topMargin = premiumPreviewFragment.Z;
            premiumPreviewFragment.f31943o0.setTranslationY(AndroidUtilities.dp(1000.0f));
            premiumPreviewFragment.f31943o0.animate().translationY(1.0f).setDuration(300L);
        }
    }
}
