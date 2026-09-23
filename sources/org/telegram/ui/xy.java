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
public final class xy extends org.telegram.ui.Components.ll0 {
    public final Context f39679c;
    public final az d;

    public xy(az azVar, Context context) {
        this.d = azVar;
        this.f39679c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
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
        az azVar = this.d;
        if (i10 == azVar.h) {
            return 1;
        }
        if (i10 == azVar.f31907s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42630f;
        View view = c1Var.f42627a;
        boolean z10 = true;
        az azVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    Long l4 = (Long) azVar.e.get(i10 - azVar.f31905n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = azVar.getMessagesController().getUser(l4);
                        if (i10 == azVar.f31906r - 1) {
                            z10 = false;
                        }
                        g4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = azVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == azVar.f31906r - 1) {
                        z10 = false;
                    }
                    g4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            Context context = this.f39679c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18917k7, false), mode));
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (azVar.f31905n == -1) {
                z10 = false;
            }
            s8Var.n(string, qqVar, z10);
            s8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        if (i10 == azVar.f31907s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = azVar.f31908w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            f9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zy zyVar;
        int i11;
        Context context = this.f39679c;
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
                    g4Var.addView(imageView, w7.x5.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new ci.q1(5, this, g4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18755b9, false), PorterDuff.Mode.MULTIPLY));
                    zyVar = g4Var;
                } else {
                    az azVar = this.d;
                    zy zyVar2 = new zy(azVar, context);
                    azVar.f31904f = zyVar2;
                    zyVar = zyVar2;
                }
            } else {
                FrameLayout s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                zyVar = s8Var;
            }
        } else {
            FrameLayout f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7));
            zyVar = f9Var;
        }
        return new s4.c1(zyVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        c1Var.f42627a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
    }
}
