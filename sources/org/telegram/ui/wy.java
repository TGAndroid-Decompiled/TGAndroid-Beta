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
public final class wy extends org.telegram.ui.Components.ql0 {
    public final Context f39786c;
    public final zy d;

    public wy(zy zyVar, Context context) {
        this.d = zyVar;
        this.f39786c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
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
        zy zyVar = this.d;
        if (i10 == zyVar.h) {
            return 1;
        }
        if (i10 == zyVar.f40898s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z4 = true;
        zy zyVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    Long l10 = (Long) zyVar.e.get(i10 - zyVar.f40896n);
                    long longValue = l10.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = zyVar.getMessagesController().getUser(l10);
                        if (i10 == zyVar.f40897r - 1) {
                            z4 = false;
                        }
                        f4Var.e(user, null, null, z4);
                        return;
                    }
                    TLRPC.Chat chat = zyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == zyVar.f40897r - 1) {
                        z4 = false;
                    }
                    f4Var.e(chat, null, null, z4);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            n8Var.e(-1, org.telegram.ui.ActionBar.j6.f20115q6);
            Context context = this.f39786c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20007k7, false), mode));
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (zyVar.f40896n == -1) {
                z4 = false;
            }
            n8Var.n(string, mqVar, z4);
            n8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i10 == zyVar.f40898s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = zyVar.f40899w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            z8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yy yyVar;
        int i11;
        Context context = this.f39786c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    f4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    f4Var.addView(imageView, k7.b6.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new org.telegram.ui.ActionBar.i1(4, this, f4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19848b9, false), PorterDuff.Mode.MULTIPLY));
                    yyVar = f4Var;
                } else {
                    zy zyVar = this.d;
                    yy yyVar2 = new yy(zyVar, context);
                    zyVar.f40895f = yyVar2;
                    yyVar = yyVar2;
                }
            } else {
                FrameLayout n8Var = new org.telegram.ui.Cells.n8(context);
                n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                yyVar = n8Var;
            }
        } else {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
            yyVar = z8Var;
        }
        return new f2.l1(yyVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        l1Var.f5774a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
    }
}
