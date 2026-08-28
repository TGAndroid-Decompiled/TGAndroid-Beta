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
public final class vu0 extends org.telegram.ui.Components.vk0 {
    public final Context f43586c;
    public final xu0 d;

    public vu0(xu0 xu0Var, Context context) {
        this.d = xu0Var;
        this.f43586c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int b10 = q1Var.b();
        xu0 xu0Var = this.d;
        if (b10 != xu0Var.f44615e0 && b10 != xu0Var.f44628q0 && b10 != xu0Var.f44630r0) {
            if (xu0Var.E && b10 >= (i9 = xu0Var.f44621j0) && b10 < xu0Var.f44640y + i9) {
                if (b10 - i9 < xu0Var.f44638x) {
                    return false;
                }
            } else if (b10 != xu0Var.f44622k0 && b10 != xu0Var.f44625n0 && b10 != xu0Var.f44626o0 && (xu0Var.J != 0 || b10 != xu0Var.f44627p0)) {
                return false;
            }
            return true;
        }
        return !xu0Var.E;
    }

    @Override
    public final int h() {
        return this.d.f44633t0;
    }

    @Override
    public final int j(int i9) {
        xu0 xu0Var = this.d;
        if (i9 != xu0Var.f44613d0 && i9 != xu0Var.f44620i0 && i9 != xu0Var.m0) {
            if (i9 == xu0Var.f44619h0) {
                return 1;
            }
            if (i9 != xu0Var.f44623l0 && i9 != xu0Var.f44632s0 && i9 != xu0Var.f44618g0) {
                if (i9 == xu0Var.f44622k0) {
                    return 3;
                }
                if (i9 == xu0Var.f44615e0) {
                    return 4;
                }
                if (i9 == xu0Var.f44617f0) {
                    return 7;
                }
                if (i9 != xu0Var.f44625n0 && i9 != xu0Var.f44626o0 && i9 != xu0Var.f44627p0 && i9 != xu0Var.f44628q0 && i9 != xu0Var.f44630r0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        xu0 xu0Var = this.d;
        int i14 = xu0Var.J;
        boolean z10 = xu0Var.Z;
        int i15 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f43586c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        p8Var.e(-1, org.telegram.ui.ActionBar.f6.f23229q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23128k7, false), mode));
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
                        if (z10) {
                            i13 = R.string.TodoNewTask;
                        } else {
                            i13 = R.string.AddAnOption;
                        }
                        p8Var.n(LocaleController.getString(i13), fqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                if (i9 == xu0Var.f44618g0) {
                    b9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i9 == xu0Var.f44632s0) {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    return;
                } else {
                    int i16 = xu0Var.f44624n - xu0Var.f44640y;
                    if (i16 <= 0) {
                        if (z10) {
                            i12 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i12 = R.string.AddAnOptionInfoMax;
                        }
                        b9Var.setText(LocaleController.getString(i12));
                        return;
                    } else if (z10) {
                        b9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i16));
                        return;
                    } else {
                        b9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i16, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setEnabled(!xu0Var.E);
            Switch checkBox = t8Var.getCheckBox();
            if (!xu0Var.E) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i9 == xu0Var.f44628q0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), xu0Var.D, true);
                t8Var.e(null, true);
                return;
            } else if (i9 == xu0Var.f44630r0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), xu0Var.F, false);
                t8Var.e(null, true);
                return;
            } else if (i9 == xu0Var.f44625n0) {
                t8Var.f(LocaleController.getString(R.string.PollAnonymous), xu0Var.C, (xu0Var.f44626o0 == -1 && xu0Var.f44627p0 == -1) ? true : true);
                t8Var.e(null, true);
                return;
            } else if (i9 == xu0Var.f44626o0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = xu0Var.G;
                if (xu0Var.f44627p0 != -1) {
                    z12 = true;
                }
                t8Var.f(string, z13, z12);
                t8Var.e(null, true);
                return;
            } else if (i9 == xu0Var.f44627p0) {
                t8Var.f(LocaleController.getString(R.string.PollQuiz), xu0Var.H, false);
                if (i14 != 0) {
                    z11 = false;
                }
                t8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i9 == xu0Var.f44613d0) {
            if (z10) {
                if (xu0Var.f44635v0 != null) {
                    i11 = R.string.TodoEditTitle;
                } else {
                    i11 = R.string.TodoTitle;
                }
            } else {
                i11 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i9 == xu0Var.f44620i0) {
            if (i14 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i10 = R.string.TodoItemsTitle;
            } else {
                i10 = R.string.AnswerOptions2;
            }
            m4Var.setText(LocaleController.getString(i10));
        } else if (i9 == xu0Var.m0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        uu0 uu0Var;
        xu0 xu0Var = this.d;
        boolean z10 = xu0Var.Y;
        if (i9 != 0) {
            Context context = this.f43586c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    uu0 uu0Var2 = new uu0(this, context, z10 ? 1 : 0, new q50(xu0Var, 22));
                                    uu0Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                                    uu0Var2.b(new fh.t4(this, uu0Var2, false, 12));
                                    uu0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = uu0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new td(3, this, uu0Var2));
                                    textView.setOnKeyListener(new kg(uu0Var2, 2));
                                    uu0Var = uu0Var2;
                                } else {
                                    tu0 tu0Var = new tu0(this, context, z10 ? 1 : 0);
                                    tu0Var.c();
                                    tu0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                                    tu0Var.b(new fh.t4(this, tu0Var, false, 11));
                                    uu0Var = tu0Var;
                                }
                            } else {
                                View t8Var = new org.telegram.ui.Cells.t8(context);
                                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                                uu0Var = t8Var;
                            }
                        } else {
                            su0 su0Var = new su0(this, context, z10 ? 1 : 0);
                            su0Var.c();
                            su0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                            su0Var.b(new fh.t4(this, su0Var, false, 10));
                            uu0Var = su0Var;
                        }
                    } else {
                        View p8Var = new org.telegram.ui.Cells.p8(context);
                        p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        uu0Var = p8Var;
                    }
                } else {
                    uu0Var = new org.telegram.ui.Cells.b9(context);
                }
            } else {
                uu0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f43586c, org.telegram.ui.ActionBar.f6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            uu0Var = m4Var;
        }
        return j3.r0.s(uu0Var, uu0Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        xu0 xu0Var = this.d;
        boolean z11 = xu0Var.Z;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            fh.s sVar = c6Var.d;
            CharSequence charSequence2 = xu0Var.A;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i11), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!xu0Var.E);
            sVar.setEnabled(true ^ xu0Var.E);
            int themedColor = xu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
            if (!xu0Var.E) {
                f10 = 1.0f;
            }
            sVar.setTextColor(org.telegram.ui.ActionBar.f6.l1(f10, themedColor));
            xu0.b0(xu0Var, view, q1Var.b());
        } else if (i12 == 5) {
            int b10 = q1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            fh.s sVar2 = c6Var2.d;
            int i13 = b10 - xu0Var.f44621j0;
            if (xu0Var.E && i13 < xu0Var.f44638x) {
                z10 = false;
            } else {
                z10 = true;
            }
            sVar2.setEnabled(z10);
            int themedColor2 = xu0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
            if (z10) {
                f10 = 1.0f;
            }
            sVar2.setTextColor(org.telegram.ui.ActionBar.f6.l1(f10, themedColor2));
            CharSequence charSequence3 = xu0Var.v[i13];
            if (z11) {
                i9 = R.string.TodoTaskPlaceholder;
            } else {
                i9 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i9), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f24199f;
            if (imageView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = c6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!xu0Var.f44610b0 && xu0Var.f44612c0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                xu0Var.f44610b0 = false;
                xu0Var.f44612c0 = -1;
            }
            xu0.b0(xu0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = xu0Var.B;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            xu0.b0(xu0Var, view, q1Var.b());
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 4 || i9 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) q1Var.f5501a).getTextView();
            if (textView.isFocused()) {
                xu0 xu0Var = this.d;
                if (xu0Var.Y) {
                    org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
                    if (ux0Var != null) {
                        ux0Var.f();
                    }
                    xu0Var.j0(true);
                }
                xu0Var.X = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
