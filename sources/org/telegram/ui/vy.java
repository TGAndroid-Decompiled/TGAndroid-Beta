package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class vy extends org.telegram.ui.Components.sl0 {
    public final Context f42318c;
    public final yy d;

    public vy(yy yyVar, Context context) {
        this.d = yyVar;
        this.f42318c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        yy yyVar = this.d;
        if (i10 == yyVar.h) {
            return 1;
        }
        if (i10 == yyVar.f43737s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = true;
        yy yyVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    Long l10 = (Long) yyVar.f43733e.get(i10 - yyVar.f43735n);
                    long longValue = l10.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = yyVar.getMessagesController().getUser(l10);
                        if (i10 == yyVar.f43736r - 1) {
                            z4 = false;
                        }
                        g4Var.e(user, null, null, z4);
                        return;
                    }
                    TLRPC.Chat chat = yyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == yyVar.f43736r - 1) {
                        z4 = false;
                    }
                    g4Var.e(chat, null, null, z4);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21894q6);
            Context context = this.f42318c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21786k7, false), mode));
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (yyVar.f43735n == -1) {
                z4 = false;
            }
            o8Var.n(string, pqVar, z4);
            o8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i10 == yyVar.f43737s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = yyVar.f43738w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            a9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        xy xyVar;
        int i11;
        Context context = this.f42318c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout g4Var = new org.telegram.ui.Cells.g4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    g4Var.addView(imageView, k7.c6.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new org.telegram.ui.ActionBar.i1(4, this, g4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21626b9, false), PorterDuff.Mode.MULTIPLY));
                    xyVar = g4Var;
                } else {
                    yy yyVar = this.d;
                    xy xyVar2 = new xy(yyVar, context);
                    yyVar.f43734f = xyVar2;
                    xyVar = xyVar2;
                }
            } else {
                FrameLayout o8Var = new org.telegram.ui.Cells.o8(context);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                xyVar = o8Var;
            }
        } else {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
            xyVar = a9Var;
        }
        return new f2.m1(xyVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        m1Var.f5875a.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
    }
}
