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
public final class xv0 extends org.telegram.ui.Components.kl0 {
    public final Context f42932c;
    public final zv0 d;

    public xv0(zv0 zv0Var, Context context) {
        this.d = zv0Var;
        this.f42932c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        zv0 zv0Var = this.d;
        if (b10 != zv0Var.f43567i0 && b10 != zv0Var.f43581u0 && b10 != zv0Var.f43582v0) {
            if (zv0Var.I && b10 >= (i10 = zv0Var.f43572n0) && b10 < zv0Var.f43587y + i10) {
                if (b10 - i10 < zv0Var.f43585x) {
                    return false;
                }
            } else if (b10 != zv0Var.f43573o0 && b10 != zv0Var.f43577r0 && b10 != zv0Var.f43579s0 && (zv0Var.N != 0 || b10 != zv0Var.f43580t0)) {
                return false;
            }
            return true;
        }
        return !zv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f43586x0;
    }

    @Override
    public final int j(int i10) {
        zv0 zv0Var = this.d;
        if (i10 != zv0Var.f43566h0 && i10 != zv0Var.m0 && i10 != zv0Var.f43575q0) {
            if (i10 == zv0Var.f43570l0) {
                return 1;
            }
            if (i10 != zv0Var.f43574p0 && i10 != zv0Var.f43584w0 && i10 != zv0Var.f43569k0) {
                if (i10 == zv0Var.f43573o0) {
                    return 3;
                }
                if (i10 == zv0Var.f43567i0) {
                    return 4;
                }
                if (i10 == zv0Var.f43568j0) {
                    return 7;
                }
                if (i10 != zv0Var.f43577r0 && i10 != zv0Var.f43579s0 && i10 != zv0Var.f43580t0 && i10 != zv0Var.f43581u0 && i10 != zv0Var.f43582v0) {
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
        zv0 zv0Var = this.d;
        int i15 = zv0Var.N;
        boolean z10 = zv0Var.f43560d0;
        int i16 = c1Var.f45770f;
        View view = c1Var.f45766a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f42932c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20819k7, false), mode));
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), oqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20654b7));
                if (i10 == zv0Var.f43569k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == zv0Var.f43584w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = zv0Var.f43571n - zv0Var.f43587y;
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
            w8Var.setEnabled(!zv0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!zv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == zv0Var.f43581u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), zv0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == zv0Var.f43582v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), zv0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == zv0Var.f43577r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), zv0Var.G, (zv0Var.f43579s0 == -1 && zv0Var.f43580t0 == -1) ? true : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == zv0Var.f43579s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = zv0Var.K;
                if (zv0Var.f43580t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == zv0Var.f43580t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), zv0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                w8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == zv0Var.f43566h0) {
            if (z10) {
                if (zv0Var.f43589z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == zv0Var.m0) {
            if (i15 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            l4Var.setText(LocaleController.getString(i11));
        } else if (i10 == zv0Var.f43575q0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wv0 wv0Var;
        zv0 zv0Var = this.d;
        boolean z10 = zv0Var.f43559c0;
        if (i10 != 0) {
            Context context = this.f42932c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    wv0 wv0Var2 = new wv0(this, context, z10 ? 1 : 0, new l60(zv0Var, 21));
                                    wv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                                    wv0Var2.b(new org.telegram.ui.Components.pn(6, this, wv0Var2));
                                    wv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = wv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new wd(3, this, wv0Var2));
                                    textView.setOnKeyListener(new vg(wv0Var2, 2));
                                    wv0Var = wv0Var2;
                                } else {
                                    vv0 vv0Var = new vv0(this, context, z10 ? 1 : 0);
                                    vv0Var.c();
                                    vv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                                    vv0Var.b(new org.telegram.ui.Components.pn(5, this, vv0Var));
                                    wv0Var = vv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                                wv0Var = w8Var;
                            }
                        } else {
                            uv0 uv0Var = new uv0(this, context, z10 ? 1 : 0);
                            uv0Var.c();
                            uv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                            uv0Var.b(new org.telegram.ui.Components.pn(4, this, uv0Var));
                            wv0Var = uv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
                        wv0Var = r8Var;
                    }
                } else {
                    wv0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                wv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f42932c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
            wv0Var = l4Var;
        }
        return com.google.android.gms.internal.vision.e2.l(wv0Var, wv0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        zv0 zv0Var = this.d;
        boolean z11 = zv0Var.f43560d0;
        int i13 = c1Var.f45770f;
        View view = c1Var.f45766a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence2 = zv0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i12), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!zv0Var.I);
            b6Var.setEnabled(true ^ zv0Var.I);
            int themedColor = zv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (!zv0Var.I) {
                f7 = 1.0f;
            }
            b6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor));
            zv0.c0(zv0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            org.telegram.ui.Cells.b6 b6Var2 = c6Var2.d;
            int i14 = b10 - zv0Var.f43572n0;
            if (zv0Var.I && i14 < zv0Var.f43585x) {
                z10 = false;
            } else {
                z10 = true;
            }
            b6Var2.setEnabled(z10);
            int themedColor2 = zv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            b6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor2));
            CharSequence charSequence3 = zv0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f21713f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = c6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!zv0Var.f43564f0 && zv0Var.f43565g0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                zv0Var.f43564f0 = false;
                zv0Var.f43565g0 = -1;
            }
            zv0.c0(zv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = zv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            zv0.c0(zv0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.f45766a).getTextView();
            if (textView.isFocused()) {
                zv0 zv0Var = this.d;
                if (zv0Var.f43559c0) {
                    org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
                    if (my0Var != null) {
                        my0Var.f();
                    }
                    zv0Var.k0(true);
                }
                zv0Var.f43557b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
