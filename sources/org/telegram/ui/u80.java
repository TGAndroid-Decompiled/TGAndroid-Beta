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
public final class u80 extends org.telegram.ui.Components.kl0 {
    public final Context f40972c;
    public final boolean d;
    public final LanguageSelectActivity f40973e;

    public u80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.f40973e = languageSelectActivity;
        this.f40972c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
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
        LanguageSelectActivity languageSelectActivity = this.f40973e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.f33419e;
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
        int size = languageSelectActivity.f33420f.size() + i11 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u80.j(int):int");
    }

    @Override
    public final void v(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u80.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        org.telegram.ui.Cells.a7 a7Var;
        int i15 = 5;
        Context context = this.f40972c;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        if (i10 != 6) {
                            a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                        } else {
                            a7Var = new org.telegram.ui.Cells.e9(context);
                        }
                    } else {
                        a7Var = new org.telegram.ui.Cells.ea(context);
                    }
                } else {
                    a7Var = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                a7Var = new org.telegram.ui.Cells.w8(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f21994e = 50;
            frameLayout.f21997r = 21;
            TextView textView = new TextView(context);
            frameLayout.f21991a = textView;
            org.telegram.messenger.wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
            frameLayout.addView(textView, w7.x5.d(-1, -1.0f, i16, f7, 0.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f21992b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21061z6, false));
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
            if (z11) {
                f12 = 64.0f;
            } else {
                f12 = 21;
            }
            frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, i17, f11, 36.0f, f12, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f21993c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20719g7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20736h7, false));
            if (!LocaleController.isRTL) {
                i15 = 3;
            }
            frameLayout.addView(radioButton, w7.x5.d(20, 20.0f, i15 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            frameLayout.f21996n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            a7Var = frameLayout;
        }
        return new s4.c1(a7Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f45738a;
        if (view instanceof org.telegram.ui.Cells.g9) {
            ((org.telegram.ui.Cells.g9) view).c();
        }
    }
}
