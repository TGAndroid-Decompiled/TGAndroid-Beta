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
public final class y70 extends org.telegram.ui.Components.vk0 {
    public final Context f44764c;
    public final boolean d;
    public final LanguageSelectActivity f44765e;

    public y70(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.f44765e = languageSelectActivity;
        this.f44764c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 4 && i9 != 5 && i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i9;
        int i10;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.f44765e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.f35489e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (!languageSelectActivity.getMessagesController().isTranslationsManualEnabled() && !languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            i10 = 1;
        } else {
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                i9 = 3;
            } else {
                i9 = 2;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i9++;
            }
            if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                i9++;
            }
            i10 = i9 + 1;
        }
        int size = languageSelectActivity.f35490f.size() + i10 + 1;
        if (!languageSelectActivity.h.isEmpty()) {
            return languageSelectActivity.h.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y70.j(int):int");
    }

    @Override
    public final void v(f2.q1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y70.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        org.telegram.ui.Cells.z6 z6Var;
        int i14 = 5;
        Context context = this.f44764c;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4 && i9 != 5) {
                        if (i9 != 6) {
                            z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                        } else {
                            z6Var = new org.telegram.ui.Cells.b9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.ba(context);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                z6Var = new org.telegram.ui.Cells.t8(context);
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f24243e = 50;
            frameLayout.f24246r = 21;
            TextView textView = new TextView(context);
            frameLayout.f24240a = textView;
            org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i15 = i11 | 48;
            if (z10) {
                f10 = 21;
            } else {
                f10 = 64.0f;
            }
            if (z10) {
                f11 = 64.0f;
            } else {
                f11 = 21;
            }
            frameLayout.addView(textView, g7.e6.d(-1, -1.0f, i15, f10, 0.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f24241b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false));
            textView2.setTextSize(1, 13.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i16 = i13 | 48;
            if (z11) {
                f12 = 21;
            } else {
                f12 = 64.0f;
            }
            if (z11) {
                f13 = 64.0f;
            } else {
                f13 = 21;
            }
            frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, i16, f12, 36.0f, f13, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f24242c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23056g7, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23074h7, false));
            if (!LocaleController.isRTL) {
                i14 = 3;
            }
            frameLayout.addView(radioButton, g7.e6.d(20, 20.0f, i14 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            frameLayout.f24245n = LocaleController.isRTL;
            frameLayout.setClipChildren(false);
            z6Var = frameLayout;
        }
        return new f2.q1(z6Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.d9) {
            ((org.telegram.ui.Cells.d9) view).c();
        }
    }
}
