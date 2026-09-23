package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class rv0 extends org.telegram.ui.Components.ll0 {
    public final Context f36943c;
    public final tv0 d;

    public rv0(tv0 tv0Var, Context context) {
        this.d = tv0Var;
        this.f36943c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        tv0 tv0Var = this.d;
        if (b10 != tv0Var.f37779i0 && b10 != tv0Var.f37793u0 && b10 != tv0Var.f37794v0) {
            if (tv0Var.I && b10 >= (i10 = tv0Var.f37784n0) && b10 < tv0Var.f37799y + i10) {
                if (b10 - i10 < tv0Var.f37797x) {
                    return false;
                }
            } else if (b10 != tv0Var.f37785o0 && b10 != tv0Var.f37789r0 && b10 != tv0Var.f37791s0 && (tv0Var.N != 0 || b10 != tv0Var.f37792t0)) {
                return false;
            }
            return true;
        }
        return !tv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f37798x0;
    }

    @Override
    public final int j(int i10) {
        tv0 tv0Var = this.d;
        if (i10 != tv0Var.f37778h0 && i10 != tv0Var.m0 && i10 != tv0Var.f37787q0) {
            if (i10 == tv0Var.f37782l0) {
                return 1;
            }
            if (i10 != tv0Var.f37786p0 && i10 != tv0Var.f37796w0 && i10 != tv0Var.f37781k0) {
                if (i10 == tv0Var.f37785o0) {
                    return 3;
                }
                if (i10 == tv0Var.f37779i0) {
                    return 4;
                }
                if (i10 == tv0Var.f37780j0) {
                    return 7;
                }
                if (i10 != tv0Var.f37789r0 && i10 != tv0Var.f37791s0 && i10 != tv0Var.f37792t0 && i10 != tv0Var.f37793u0 && i10 != tv0Var.f37794v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        tv0 tv0Var = this.d;
        int i15 = tv0Var.N;
        boolean z10 = tv0Var.f37773d0;
        int i16 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f36943c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        s8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18917k7, false), mode));
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        s8Var.n(LocaleController.getString(i14), qqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                f9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7));
                if (i10 == tv0Var.f37781k0) {
                    f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == tv0Var.f37796w0) {
                    f9Var.setFixedSize(12);
                    f9Var.setText(null);
                    return;
                } else {
                    int i17 = tv0Var.f37783n - tv0Var.f37799y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        f9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        f9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        f9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setEnabled(!tv0Var.I);
            Switch checkBox = x8Var.getCheckBox();
            if (!tv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == tv0Var.f37793u0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), tv0Var.H, true);
                x8Var.e(null, true);
                return;
            } else if (i10 == tv0Var.f37794v0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), tv0Var.J, false);
                x8Var.e(null, true);
                return;
            } else if (i10 == tv0Var.f37789r0) {
                x8Var.f(LocaleController.getString(R.string.PollAnonymous), tv0Var.G, (tv0Var.f37791s0 == -1 && tv0Var.f37792t0 == -1) ? true : true);
                x8Var.e(null, true);
                return;
            } else if (i10 == tv0Var.f37791s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = tv0Var.K;
                if (tv0Var.f37792t0 != -1) {
                    z12 = true;
                }
                x8Var.f(string, z13, z12);
                x8Var.e(null, true);
                return;
            } else if (i10 == tv0Var.f37792t0) {
                x8Var.f(LocaleController.getString(R.string.PollQuiz), tv0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                x8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == tv0Var.f37778h0) {
            if (z10) {
                if (tv0Var.f37801z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == tv0Var.m0) {
            if (i15 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i10 == tv0Var.f37787q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var;
        tv0 tv0Var = this.d;
        boolean z10 = tv0Var.f37772c0;
        if (i10 != 0) {
            Context context = this.f36943c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    qv0 qv0Var2 = new qv0(this, context, z10 ? 1 : 0, new h60(tv0Var, 21));
                                    qv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                                    qv0Var2.c(new org.telegram.ui.Components.rn(6, this, qv0Var2));
                                    qv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = qv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new vd(3, this, qv0Var2));
                                    textView.setOnKeyListener(new tg(qv0Var2, 2));
                                    qv0Var = qv0Var2;
                                } else {
                                    pv0 pv0Var = new pv0(this, context, z10 ? 1 : 0);
                                    pv0Var.d();
                                    pv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                                    pv0Var.c(new org.telegram.ui.Components.rn(5, this, pv0Var));
                                    qv0Var = pv0Var;
                                }
                            } else {
                                View x8Var = new org.telegram.ui.Cells.x8(context);
                                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                                qv0Var = x8Var;
                            }
                        } else {
                            ov0 ov0Var = new ov0(this, context, z10 ? 1 : 0);
                            ov0Var.d();
                            ov0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                            ov0Var.c(new org.telegram.ui.Components.rn(4, this, ov0Var));
                            qv0Var = ov0Var;
                        }
                    } else {
                        View s8Var = new org.telegram.ui.Cells.s8(context);
                        s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                        qv0Var = s8Var;
                    }
                } else {
                    qv0Var = new org.telegram.ui.Cells.f9(context);
                }
            } else {
                qv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f36943c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
            qv0Var = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(qv0Var, qv0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        tv0 tv0Var = this.d;
        boolean z11 = tv0Var.f37773d0;
        int i13 = c1Var.f42630f;
        View view = c1Var.f42627a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = tv0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            d6Var.n(charSequence, LocaleController.getString(i12), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!tv0Var.I);
            c6Var.setEnabled(true ^ tv0Var.I);
            int themedColor = tv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (!tv0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(f7, themedColor));
            tv0.c0(tv0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - tv0Var.f37784n0;
            if (tv0Var.I && i14 < tv0Var.f37797x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = tv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.l1(f7, themedColor2));
            CharSequence charSequence3 = tv0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f19864f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = d6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!tv0Var.f37776f0 && tv0Var.f37777g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                tv0Var.f37776f0 = false;
                tv0Var.f37777g0 = -1;
            }
            tv0.c0(tv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = tv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            tv0.c0(tv0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42627a).getTextView();
            if (textView.isFocused()) {
                tv0 tv0Var = this.d;
                if (tv0Var.f37772c0) {
                    org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
                    if (my0Var != null) {
                        my0Var.f();
                    }
                    tv0Var.k0(true);
                }
                tv0Var.f37770b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
