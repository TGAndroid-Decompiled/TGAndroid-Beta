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
public final class zv0 extends org.telegram.ui.Components.ul0 {
    public final Context f39456c;
    public final bw0 d;

    public zv0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.f39456c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        bw0 bw0Var = this.d;
        if (b10 != bw0Var.f31436i0 && b10 != bw0Var.f31450u0 && b10 != bw0Var.f31451v0) {
            if (bw0Var.I && b10 >= (i10 = bw0Var.f31441n0) && b10 < bw0Var.f31456y + i10) {
                if (b10 - i10 < bw0Var.f31454x) {
                    return false;
                }
            } else if (b10 != bw0Var.f31442o0 && b10 != bw0Var.f31446r0 && b10 != bw0Var.f31448s0 && (bw0Var.N != 0 || b10 != bw0Var.f31449t0)) {
                return false;
            }
            return true;
        }
        return !bw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f31455x0;
    }

    @Override
    public final int j(int i10) {
        bw0 bw0Var = this.d;
        if (i10 != bw0Var.f31435h0 && i10 != bw0Var.m0 && i10 != bw0Var.f31444q0) {
            if (i10 == bw0Var.f31439l0) {
                return 1;
            }
            if (i10 != bw0Var.f31443p0 && i10 != bw0Var.f31453w0 && i10 != bw0Var.f31438k0) {
                if (i10 == bw0Var.f31442o0) {
                    return 3;
                }
                if (i10 == bw0Var.f31436i0) {
                    return 4;
                }
                if (i10 == bw0Var.f31437j0) {
                    return 7;
                }
                if (i10 != bw0Var.f31446r0 && i10 != bw0Var.f31448s0 && i10 != bw0Var.f31449t0 && i10 != bw0Var.f31450u0 && i10 != bw0Var.f31451v0) {
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
        bw0 bw0Var = this.d;
        int i15 = bw0Var.N;
        boolean z10 = bw0Var.f31430d0;
        int i16 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f39456c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        s8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18056k7, false), mode));
                        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        s8Var.n(LocaleController.getString(i14), vqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                if (i10 == bw0Var.f31438k0) {
                    f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == bw0Var.f31453w0) {
                    f9Var.setFixedSize(12);
                    f9Var.setText(null);
                    return;
                } else {
                    int i17 = bw0Var.f31440n - bw0Var.f31456y;
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
            x8Var.setEnabled(!bw0Var.I);
            Switch checkBox = x8Var.getCheckBox();
            if (!bw0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == bw0Var.f31450u0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), bw0Var.H, true);
                x8Var.e(null, true);
                return;
            } else if (i10 == bw0Var.f31451v0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), bw0Var.J, false);
                x8Var.e(null, true);
                return;
            } else if (i10 == bw0Var.f31446r0) {
                x8Var.f(LocaleController.getString(R.string.PollAnonymous), bw0Var.G, (bw0Var.f31448s0 == -1 && bw0Var.f31449t0 == -1) ? true : true);
                x8Var.e(null, true);
                return;
            } else if (i10 == bw0Var.f31448s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = bw0Var.K;
                if (bw0Var.f31449t0 != -1) {
                    z12 = true;
                }
                x8Var.f(string, z13, z12);
                x8Var.e(null, true);
                return;
            } else if (i10 == bw0Var.f31449t0) {
                x8Var.f(LocaleController.getString(R.string.PollQuiz), bw0Var.L, false);
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
        if (i10 == bw0Var.f31435h0) {
            if (z10) {
                if (bw0Var.f31458z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == bw0Var.m0) {
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
        } else if (i10 == bw0Var.f31444q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yv0 yv0Var;
        bw0 bw0Var = this.d;
        boolean z10 = bw0Var.f31429c0;
        if (i10 != 0) {
            Context context = this.f39456c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    yv0 yv0Var2 = new yv0(this, context, z10 ? 1 : 0, new l60(bw0Var, 21));
                                    yv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                                    yv0Var2.c(new og.x(7, this, yv0Var2));
                                    yv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = yv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new xd(3, this, yv0Var2));
                                    textView.setOnKeyListener(new wg(yv0Var2, 2));
                                    yv0Var = yv0Var2;
                                } else {
                                    xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0);
                                    xv0Var.d();
                                    xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                                    xv0Var.c(new og.x(6, this, xv0Var));
                                    yv0Var = xv0Var;
                                }
                            } else {
                                View x8Var = new org.telegram.ui.Cells.x8(context);
                                x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                                yv0Var = x8Var;
                            }
                        } else {
                            wv0 wv0Var = new wv0(this, context, z10 ? 1 : 0);
                            wv0Var.d();
                            wv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                            wv0Var.c(new og.x(5, this, wv0Var));
                            yv0Var = wv0Var;
                        }
                    } else {
                        View s8Var = new org.telegram.ui.Cells.s8(context);
                        s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                        yv0Var = s8Var;
                    }
                } else {
                    yv0Var = new org.telegram.ui.Cells.f9(context);
                }
            } else {
                yv0Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f39456c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            yv0Var = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.j(yv0Var, yv0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        bw0 bw0Var = this.d;
        boolean z11 = bw0Var.f31430d0;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            org.telegram.ui.Cells.d6 d6Var = e6Var.d;
            CharSequence charSequence2 = bw0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            e6Var.n(charSequence, LocaleController.getString(i12), false);
            e6Var.setTag(null);
            e6Var.setEnabled(!bw0Var.I);
            d6Var.setEnabled(true ^ bw0Var.I);
            int themedColor = bw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (!bw0Var.I) {
                f7 = 1.0f;
            }
            d6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor));
            bw0.c0(bw0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.setTag(1);
            org.telegram.ui.Cells.d6 d6Var2 = e6Var2.d;
            int i14 = b10 - bw0Var.f31441n0;
            if (bw0Var.I && i14 < bw0Var.f31454x) {
                z10 = false;
            } else {
                z10 = true;
            }
            d6Var2.setEnabled(z10);
            int themedColor2 = bw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            d6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor2));
            CharSequence charSequence3 = bw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            e6Var2.n(charSequence3, LocaleController.getString(i10), true);
            e6Var2.setTag(null);
            ImageView imageView = e6Var2.f19076f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = e6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!bw0Var.f31433f0 && bw0Var.f31434g0 == b10) {
                EditTextBoldCursor textView = e6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                bw0Var.f31433f0 = false;
                bw0Var.f31434g0 = -1;
            }
            bw0.c0(bw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
            e6Var3.setTag(1);
            CharSequence charSequence4 = bw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            e6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            e6Var3.setTag(null);
            bw0.c0(bw0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.f41610a).getTextView();
            if (textView.isFocused()) {
                bw0 bw0Var = this.d;
                if (bw0Var.f31429c0) {
                    org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
                    if (zy0Var != null) {
                        zy0Var.f();
                    }
                    bw0Var.k0(true);
                }
                bw0Var.f31427b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
