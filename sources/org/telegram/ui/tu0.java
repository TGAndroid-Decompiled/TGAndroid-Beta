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
public final class tu0 extends org.telegram.ui.Components.il0 {
    public final Context f43099c;
    public final vu0 d;

    public tu0(vu0 vu0Var, Context context) {
        this.d = vu0Var;
        this.f43099c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int b10 = n1Var.b();
        vu0 vu0Var = this.d;
        if (b10 != vu0Var.f43760e0 && b10 != vu0Var.f43773q0 && b10 != vu0Var.f43775r0) {
            if (vu0Var.E && b10 >= (i10 = vu0Var.f43766j0) && b10 < vu0Var.f43785y + i10) {
                if (b10 - i10 < vu0Var.f43783x) {
                    return false;
                }
            } else if (b10 != vu0Var.f43767k0 && b10 != vu0Var.f43770n0 && b10 != vu0Var.f43771o0 && (vu0Var.J != 0 || b10 != vu0Var.f43772p0)) {
                return false;
            }
            return true;
        }
        return !vu0Var.E;
    }

    @Override
    public final int h() {
        return this.d.f43778t0;
    }

    @Override
    public final int j(int i10) {
        vu0 vu0Var = this.d;
        if (i10 != vu0Var.f43758d0 && i10 != vu0Var.f43765i0 && i10 != vu0Var.m0) {
            if (i10 == vu0Var.f43764h0) {
                return 1;
            }
            if (i10 != vu0Var.f43768l0 && i10 != vu0Var.f43777s0 && i10 != vu0Var.f43763g0) {
                if (i10 == vu0Var.f43767k0) {
                    return 3;
                }
                if (i10 == vu0Var.f43760e0) {
                    return 4;
                }
                if (i10 == vu0Var.f43762f0) {
                    return 7;
                }
                if (i10 != vu0Var.f43770n0 && i10 != vu0Var.f43771o0 && i10 != vu0Var.f43772p0 && i10 != vu0Var.f43773q0 && i10 != vu0Var.f43775r0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        vu0 vu0Var = this.d;
        int i15 = vu0Var.J;
        boolean z10 = vu0Var.Z;
        int i16 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f43099c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190k7, false), mode));
                        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        m8Var.n(LocaleController.getString(i14), jqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                if (i10 == vu0Var.f43763g0) {
                    y8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == vu0Var.f43777s0) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                } else {
                    int i17 = vu0Var.f43769n - vu0Var.f43785y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        y8Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        y8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        y8Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!vu0Var.E);
            Switch checkBox = q8Var.getCheckBox();
            if (!vu0Var.E) {
                f9 = 1.0f;
            } else {
                f9 = 0.6f;
            }
            checkBox.setAlpha(f9);
            if (i10 == vu0Var.f43773q0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), vu0Var.D, true);
                q8Var.e(null, true);
                return;
            } else if (i10 == vu0Var.f43775r0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), vu0Var.F, false);
                q8Var.e(null, true);
                return;
            } else if (i10 == vu0Var.f43770n0) {
                q8Var.f(LocaleController.getString(R.string.PollAnonymous), vu0Var.C, (vu0Var.f43771o0 == -1 && vu0Var.f43772p0 == -1) ? true : true);
                q8Var.e(null, true);
                return;
            } else if (i10 == vu0Var.f43771o0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = vu0Var.G;
                if (vu0Var.f43772p0 != -1) {
                    z12 = true;
                }
                q8Var.f(string, z13, z12);
                q8Var.e(null, true);
                return;
            } else if (i10 == vu0Var.f43772p0) {
                q8Var.f(LocaleController.getString(R.string.PollQuiz), vu0Var.H, false);
                if (i15 != 0) {
                    z11 = false;
                }
                q8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 == vu0Var.f43758d0) {
            if (z10) {
                if (vu0Var.f43780v0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            k4Var.setText(LocaleController.getString(i12));
        } else if (i10 == vu0Var.f43765i0) {
            if (i15 == 1) {
                k4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            k4Var.setText(LocaleController.getString(i11));
        } else if (i10 == vu0Var.m0) {
            k4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        su0 su0Var;
        vu0 vu0Var = this.d;
        boolean z10 = vu0Var.Y;
        if (i10 != 0) {
            Context context = this.f43099c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    su0 su0Var2 = new su0(this, context, z10 ? 1 : 0, new t50(vu0Var, 22));
                                    su0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                                    su0Var2.b(new ag.c0(this, su0Var2, false, 13));
                                    su0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = su0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new rd(3, this, su0Var2));
                                    textView.setOnKeyListener(new jg(su0Var2, 2));
                                    su0Var = su0Var2;
                                } else {
                                    ru0 ru0Var = new ru0(this, context, z10 ? 1 : 0);
                                    ru0Var.c();
                                    ru0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                                    ru0Var.b(new ag.c0(this, ru0Var, false, 12));
                                    su0Var = ru0Var;
                                }
                            } else {
                                View q8Var = new org.telegram.ui.Cells.q8(context);
                                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                                su0Var = q8Var;
                            }
                        } else {
                            qu0 qu0Var = new qu0(this, context, z10 ? 1 : 0);
                            qu0Var.c();
                            qu0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                            qu0Var.b(new ag.c0(this, qu0Var, false, 11));
                            su0Var = qu0Var;
                        }
                    } else {
                        View m8Var = new org.telegram.ui.Cells.m8(context);
                        m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        su0Var = m8Var;
                    }
                } else {
                    su0Var = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                su0Var = new org.telegram.ui.Cells.x6(context, (b) null);
            }
        } else {
            View k4Var = new org.telegram.ui.Cells.k4(this.f43099c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            su0Var = k4Var;
        }
        return th.m(su0Var, su0Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        vu0 vu0Var = this.d;
        boolean z11 = vu0Var.Z;
        int i13 = n1Var.f6436f;
        View view = n1Var.f6432a;
        float f9 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            bh.b bVar = a6Var.d;
            CharSequence charSequence2 = vu0Var.A;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            a6Var.n(charSequence, LocaleController.getString(i12), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!vu0Var.E);
            bVar.setEnabled(true ^ vu0Var.E);
            int themedColor = vu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (!vu0Var.E) {
                f9 = 1.0f;
            }
            bVar.setTextColor(org.telegram.ui.ActionBar.g6.l1(f9, themedColor));
            vu0.c0(vu0Var, view, n1Var.b());
        } else if (i13 == 5) {
            int b10 = n1Var.b();
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            bh.b bVar2 = a6Var2.d;
            int i14 = b10 - vu0Var.f43766j0;
            if (vu0Var.E && i14 < vu0Var.f43783x) {
                z10 = false;
            } else {
                z10 = true;
            }
            bVar2.setEnabled(z10);
            int themedColor2 = vu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (z10) {
                f9 = 1.0f;
            }
            bVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(f9, themedColor2));
            CharSequence charSequence3 = vu0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            a6Var2.n(charSequence3, LocaleController.getString(i10), true);
            a6Var2.setTag(null);
            ImageView imageView = a6Var2.f24085f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = a6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!vu0Var.f43755b0 && vu0Var.f43757c0 == b10) {
                EditTextBoldCursor textView = a6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                vu0Var.f43755b0 = false;
                vu0Var.f43757c0 = -1;
            }
            vu0.c0(vu0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            CharSequence charSequence4 = vu0Var.B;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            a6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            a6Var3.setTag(null);
            vu0.c0(vu0Var, view, n1Var.b());
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) n1Var.f6432a).getTextView();
            if (textView.isFocused()) {
                vu0 vu0Var = this.d;
                if (vu0Var.Y) {
                    org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
                    if (fy0Var != null) {
                        fy0Var.f();
                    }
                    vu0Var.k0(true);
                }
                vu0Var.X = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
