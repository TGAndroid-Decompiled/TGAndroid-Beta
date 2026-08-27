package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class wu0 extends org.telegram.ui.Components.yk0 {

    public final Context f44197c;
    public final yu0 d;

    public wu0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.f44197c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10;
        int iB = o1Var.b();
        yu0 yu0Var = this.d;
        if (iB == yu0Var.f44924e0 || iB == yu0Var.f44937q0 || iB == yu0Var.f44939r0) {
            return !yu0Var.E;
        }
        if (!yu0Var.E || iB < (i10 = yu0Var.f44930j0) || iB >= yu0Var.f44949y + i10) {
            if (iB != yu0Var.f44931k0 && iB != yu0Var.f44934n0 && iB != yu0Var.f44935o0 && (yu0Var.J != 0 || iB != yu0Var.f44936p0)) {
                return false;
            }
        } else if (iB - i10 < yu0Var.f44947x) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f44942t0;
    }

    @Override
    public final int j(int i10) {
        yu0 yu0Var = this.d;
        if (i10 == yu0Var.f44922d0 || i10 == yu0Var.f44929i0 || i10 == yu0Var.m0) {
            return 0;
        }
        if (i10 == yu0Var.f44928h0) {
            return 1;
        }
        if (i10 == yu0Var.f44932l0 || i10 == yu0Var.f44941s0 || i10 == yu0Var.f44927g0) {
            return 2;
        }
        if (i10 == yu0Var.f44931k0) {
            return 3;
        }
        if (i10 == yu0Var.f44924e0) {
            return 4;
        }
        if (i10 == yu0Var.f44926f0) {
            return 7;
        }
        return (i10 == yu0Var.f44934n0 || i10 == yu0Var.f44935o0 || i10 == yu0Var.f44936p0 || i10 == yu0Var.f44937q0 || i10 == yu0Var.f44939r0) ? 6 : 5;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        yu0 yu0Var = this.d;
        int i12 = yu0Var.J;
        boolean z10 = yu0Var.Z;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i13 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == yu0Var.f44922d0) {
                if (z10) {
                    i11 = yu0Var.f44944v0 != null ? R.string.TodoEditTitle : R.string.TodoTitle;
                } else {
                    i11 = R.string.PollQuestion2;
                }
                j4Var.setText(LocaleController.getString(i11));
                return;
            }
            if (i10 != yu0Var.f44929i0) {
                if (i10 == yu0Var.m0) {
                    j4Var.setText(LocaleController.getString(R.string.Settings));
                    return;
                }
                return;
            } else if (i12 == 1) {
                j4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            } else {
                j4Var.setText(LocaleController.getString(z10 ? R.string.TodoItemsTitle : R.string.AnswerOptions2));
                return;
            }
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setEnabled(!yu0Var.E);
            p8Var.getCheckBox().setAlpha(!yu0Var.E ? 1.0f : 0.6f);
            if (i10 == yu0Var.f44937q0) {
                p8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), yu0Var.D, true);
                p8Var.e(null, true);
                return;
            }
            if (i10 == yu0Var.f44939r0) {
                p8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), yu0Var.F, false);
                p8Var.e(null, true);
                return;
            }
            if (i10 == yu0Var.f44934n0) {
                p8Var.f(LocaleController.getString(R.string.PollAnonymous), yu0Var.C, (yu0Var.f44935o0 == -1 && yu0Var.f44936p0 == -1) ? false : true);
                p8Var.e(null, true);
                return;
            } else if (i10 == yu0Var.f44935o0) {
                p8Var.f(LocaleController.getString(R.string.PollMultiple), yu0Var.G, yu0Var.f44936p0 != -1);
                p8Var.e(null, true);
                return;
            } else {
                if (i10 == yu0Var.f44936p0) {
                    p8Var.f(LocaleController.getString(R.string.PollQuiz), yu0Var.H, false);
                    p8Var.e(null, i12 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.f44197c;
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(iW0, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false), mode));
            l8Var.n(LocaleController.getString(z10 ? R.string.TodoNewTask : R.string.AddAnOption), new org.telegram.ui.Components.dq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.setFixedSize(0);
        x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
        if (i10 == yu0Var.f44927g0) {
            x8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
            return;
        }
        if (i10 == yu0Var.f44941s0) {
            x8Var.setFixedSize(12);
            x8Var.setText(null);
            return;
        }
        int i14 = yu0Var.f44933n - yu0Var.f44949y;
        if (i14 <= 0) {
            x8Var.setText(LocaleController.getString(z10 ? R.string.TodoAddTaskInfoMax : R.string.AddAnOptionInfoMax));
        } else if (z10) {
            x8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i14));
        } else {
            x8Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i14, new Object[0])));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        yu0 yu0Var = this.d;
        boolean z10 = yu0Var.Y;
        if (i10 != 0) {
            Context context = this.f44197c;
            if (i10 == 1) {
                w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
            } else if (i10 == 2) {
                w6Var = new org.telegram.ui.Cells.x8(context);
            } else if (i10 == 3) {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
                l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = l8Var;
            } else if (i10 == 4) {
                tu0 tu0Var = new tu0(this, context, z10 ? 1 : 0);
                tu0Var.d();
                tu0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                tu0Var.c(new gh.n4(this, tu0Var, false, 10));
                w6Var = tu0Var;
            } else if (i10 == 6) {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                w6Var = p8Var;
            } else if (i10 != 7) {
                vu0 vu0Var = new vu0(this, context, z10 ? 1 : 0, new u50(yu0Var, 22));
                vu0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                vu0Var.c(new gh.n4(this, vu0Var, false, 12));
                vu0Var.setShowNextButton(true);
                EditTextBoldCursor textView = vu0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new td(3, this, vu0Var));
                textView.setOnKeyListener(new mg(vu0Var, 2));
                w6Var = vu0Var;
            } else {
                uu0 uu0Var = new uu0(this, context, z10 ? 1 : 0);
                uu0Var.d();
                uu0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                uu0Var.c(new gh.n4(this, uu0Var, false, 11));
                w6Var = uu0Var;
            }
        } else {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.f44197c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            w6Var = j4Var;
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        yu0 yu0Var = this.d;
        boolean z10 = yu0Var.Z;
        int i10 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i10 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            gh.r rVar = z5Var.d;
            CharSequence charSequence = yu0Var.A;
            z5Var.n(charSequence != null ? charSequence : "", LocaleController.getString(z10 ? R.string.TodoTitlePlaceholder : R.string.QuestionHint), false);
            z5Var.setTag(null);
            z5Var.setEnabled(!yu0Var.E);
            rVar.setEnabled(true ^ yu0Var.E);
            rVar.setTextColor(org.telegram.ui.ActionBar.g6.l1(yu0Var.E ? 0.6f : 1.0f, yu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
            yu0.c0(yu0Var, view, o1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                z5Var2.setTag(1);
                Editable editable = yu0Var.B;
                z5Var2.n(editable != null ? editable : "", LocaleController.getString(R.string.AddAnExplanation), false);
                z5Var2.setTag(null);
                yu0.c0(yu0Var, view, o1Var.b());
                return;
            }
            return;
        }
        int iB = o1Var.b();
        org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
        z5Var3.setTag(1);
        gh.r rVar2 = z5Var3.d;
        int i11 = iB - yu0Var.f44930j0;
        boolean z11 = !yu0Var.E || i11 >= yu0Var.f44947x;
        rVar2.setEnabled(z11);
        rVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(z11 ? 1.0f : 0.6f, yu0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6)));
        z5Var3.n(yu0Var.v[i11], LocaleController.getString(z10 ? R.string.TodoTaskPlaceholder : R.string.OptionHint), true);
        z5Var3.setTag(null);
        ImageView imageView = z5Var3.f26035f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = z5Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!yu0Var.f44919b0 && yu0Var.f44921c0 == iB) {
            EditTextBoldCursor textView = z5Var3.getTextView();
            textView.requestFocus();
            AndroidUtilities.showKeyboard(textView);
            yu0Var.f44919b0 = false;
            yu0Var.f44921c0 = -1;
        }
        yu0.c0(yu0Var, view, iB);
    }

    @Override
    public final void z(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) o1Var.f5789a).getTextView();
            if (textView.isFocused()) {
                yu0 yu0Var = this.d;
                if (yu0Var.Y) {
                    org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
                    if (wx0Var != null) {
                        wx0Var.f();
                    }
                    yu0Var.k0(true);
                }
                yu0Var.X = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}
