package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class t80 extends org.telegram.ui.Components.qm0 {
    public final Context f41953c;
    public final boolean d;
    public final LanguageSelectActivity f41954e;

    public t80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.f41954e = languageSelectActivity;
        this.f41953c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
        if (i10 != 0 && i10 != 4 && i10 != 5 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.f41954e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.f33811e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (!languageSelectActivity.getMessagesController().isTranslationsManualEnabled() && !languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            i11 = 1;
        } else {
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i10++;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                i10++;
            }
            i11 = i10 + 1;
        }
        int size = languageSelectActivity.f33812f.size() + i11 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t80.j(int):int");
    }

    @Override
    public final void v(s4.d1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t80.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        org.telegram.ui.Cells.b7 b7Var;
        int i15 = 5;
        Context context = this.f41953c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        if (i10 != 6) {
                            b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                        } else {
                            b7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        b7Var = new org.telegram.ui.Cells.ca(context);
                    }
                } else {
                    b7Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                b7Var = new org.telegram.ui.Cells.w8(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f22164e = 50;
            frameLayout.f22167r = 21;
            TextView textView = new TextView(context);
            frameLayout.f22161a = textView;
            org.telegram.messenger.bi.u(textView, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11 | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i16 = i12 | 48;
            float f12 = 64.0f;
            if (z10) {
                f7 = 21;
            } else {
                f7 = 64.0f;
            }
            if (z10) {
                f10 = 64.0f;
            } else {
                f10 = 21;
            }
            frameLayout.addView(textView, w7.x5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, i16));
            TextView textView2 = new TextView(context);
            frameLayout.f22162b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21203z6, false));
            textView2.setTextSize(1, 13.0f);
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView2.setGravity(i13);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i17 = i14 | 48;
            if (z11) {
                f11 = 21;
            } else {
                f11 = 64.0f;
            }
            if (!z11) {
                f12 = 21;
            }
            frameLayout.addView(textView2, w7.x5.a(-2.0f, f11, 36.0f, f12, 0.0f, -2, i17));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f22163c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20858g7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20874h7, false));
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            frameLayout.addView(radioButton, w7.x5.a(20.0f, 22.0f, 0.0f, 22.0f, 0.0f, 20, i15 | 16));
            frameLayout.f22166n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            b7Var = frameLayout;
        }
        return new s4.d1(b7Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.g9) {
            ((org.telegram.ui.Cells.g9) view).c();
        }
    }
}
