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
public final class yv0 extends org.telegram.ui.Components.kl0 {
    public final Context f39973c;
    public final aw0 d;

    public yv0(aw0 aw0Var, Context context) {
        this.d = aw0Var;
        this.f39973c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        aw0 aw0Var = this.d;
        if (b10 != aw0Var.f31962i0 && b10 != aw0Var.f31976u0 && b10 != aw0Var.f31977v0) {
            if (aw0Var.I && b10 >= (i10 = aw0Var.f31967n0) && b10 < aw0Var.f31982y + i10) {
                if (b10 - i10 < aw0Var.f31980x) {
                    return false;
                }
            } else if (b10 != aw0Var.f31968o0 && b10 != aw0Var.f31972r0 && b10 != aw0Var.f31974s0 && (aw0Var.N != 0 || b10 != aw0Var.f31975t0)) {
                return false;
            }
            return true;
        }
        return !aw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f31981x0;
    }

    @Override
    public final int j(int i10) {
        aw0 aw0Var = this.d;
        if (i10 != aw0Var.f31961h0 && i10 != aw0Var.m0 && i10 != aw0Var.f31970q0) {
            if (i10 == aw0Var.f31965l0) {
                return 1;
            }
            if (i10 != aw0Var.f31969p0 && i10 != aw0Var.f31979w0 && i10 != aw0Var.f31964k0) {
                if (i10 == aw0Var.f31968o0) {
                    return 3;
                }
                if (i10 == aw0Var.f31962i0) {
                    return 4;
                }
                if (i10 == aw0Var.f31963j0) {
                    return 7;
                }
                if (i10 != aw0Var.f31972r0 && i10 != aw0Var.f31974s0 && i10 != aw0Var.f31975t0 && i10 != aw0Var.f31976u0 && i10 != aw0Var.f31977v0) {
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
        aw0 aw0Var = this.d;
        int i15 = aw0Var.N;
        boolean z10 = aw0Var.f31956d0;
        int i16 = c1Var.f42674f;
        View view = c1Var.f42671a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f39973c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18962k7, false), mode));
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), pqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18798b7));
                if (i10 == aw0Var.f31964k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == aw0Var.f31979w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = aw0Var.f31966n - aw0Var.f31982y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        e9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!aw0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!aw0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == aw0Var.f31976u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), aw0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == aw0Var.f31977v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), aw0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == aw0Var.f31972r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), aw0Var.G, (aw0Var.f31974s0 == -1 && aw0Var.f31975t0 == -1) ? true : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == aw0Var.f31974s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = aw0Var.K;
                if (aw0Var.f31975t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == aw0Var.f31975t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), aw0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                w8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == aw0Var.f31961h0) {
            if (z10) {
                if (aw0Var.f31984z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == aw0Var.m0) {
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
        } else if (i10 == aw0Var.f31970q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var;
        aw0 aw0Var = this.d;
        boolean z10 = aw0Var.f31955c0;
        if (i10 != 0) {
            Context context = this.f39973c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    xv0 xv0Var2 = new xv0(this, context, z10 ? 1 : 0, new k60(aw0Var, 21));
                                    xv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                                    xv0Var2.c(new org.telegram.ui.Components.qn(6, this, xv0Var2));
                                    xv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = xv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new vd(3, this, xv0Var2));
                                    textView.setOnKeyListener(new vg(xv0Var2, 2));
                                    xv0Var = xv0Var2;
                                } else {
                                    wv0 wv0Var = new wv0(this, context, z10 ? 1 : 0);
                                    wv0Var.d();
                                    wv0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                                    wv0Var.c(new org.telegram.ui.Components.qn(5, this, wv0Var));
                                    xv0Var = wv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                                xv0Var = w8Var;
                            }
                        } else {
                            vv0 vv0Var = new vv0(this, context, z10 ? 1 : 0);
                            vv0Var.d();
                            vv0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                            vv0Var.c(new org.telegram.ui.Components.qn(4, this, vv0Var));
                            xv0Var = vv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                        xv0Var = r8Var;
                    }
                } else {
                    xv0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                xv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f39973c, org.telegram.ui.ActionBar.i6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
            xv0Var = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(xv0Var, xv0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        aw0 aw0Var = this.d;
        boolean z11 = aw0Var.f31956d0;
        int i13 = c1Var.f42674f;
        View view = c1Var.f42671a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = aw0Var.E;
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
            d6Var.setEnabled(!aw0Var.I);
            c6Var.setEnabled(true ^ aw0Var.I);
            int themedColor = aw0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
            if (!aw0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.i6.l1(f7, themedColor));
            aw0.c0(aw0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - aw0Var.f31967n0;
            if (aw0Var.I && i14 < aw0Var.f31980x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = aw0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.i6.l1(f7, themedColor2));
            CharSequence charSequence3 = aw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f19901f;
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
            if (!aw0Var.f31959f0 && aw0Var.f31960g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                aw0Var.f31959f0 = false;
                aw0Var.f31960g0 = -1;
            }
            aw0.c0(aw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = aw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            aw0.c0(aw0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42671a).getTextView();
            if (textView.isFocused()) {
                aw0 aw0Var = this.d;
                if (aw0Var.f31955c0) {
                    org.telegram.ui.Components.ny0 ny0Var = aw0Var.Q;
                    if (ny0Var != null) {
                        ny0Var.f();
                    }
                    aw0Var.k0(true);
                }
                aw0Var.f31953b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
