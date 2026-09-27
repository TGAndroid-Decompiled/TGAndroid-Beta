package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f38138a;
    public TextView f38139b;
    public TextView f38140c;
    public l0 d;
    public LinearLayout e;
    public LinearLayout f38141f;
    public int h;
    public AnimatorSet f38142n;
    public String f38143r;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38141f = linearLayout;
        linearLayout.setOrientation(1);
        this.f38141f.setWeightSum(100.0f);
        frameLayout.addView(this.f38141f, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f38141f.addView(frameLayout2, w7.y5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.y5.c(-1.0f, -1));
        l0 l0Var = new l0(this, context, 7);
        this.d = l0Var;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        this.f38141f.addView(this.d, w7.y5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.e, w7.y5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f38139b = textView;
        int i10 = org.telegram.ui.ActionBar.i6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f38139b.setGravity(17);
        this.f38139b.setTypeface(Typeface.MONOSPACE);
        this.f38139b.setTextSize(1, 16.0f);
        this.e.addView(this.f38139b, w7.y5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f38138a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f38138a.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        this.f38138a.setTextSize(1, 16.0f);
        this.f38138a.setLinksClickable(true);
        this.f38138a.setClickable(true);
        this.f38138a.setGravity(17);
        this.f38138a.setMovementMethod(new org.telegram.ui.Components.sv(1));
        this.e.addView(this.f38138a, w7.y5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f38140c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f38140c.setGravity(17);
        this.f38140c.setTextSize(1, 32.0f);
        this.d.addView(this.f38140c, w7.y5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40();
            imageView.setImageDrawable(p40Var);
            byte[] bArr = encryptedChat.key_hash;
            p40Var.f27268a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                p40Var.f27268a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            p40Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String bytesToHex = Utilities.bytesToHex(bArr2);
                for (int i11 = 0; i11 < 32; i11++) {
                    if (i11 != 0) {
                        if (i11 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i11 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i12 = i11 * 2;
                    spannableStringBuilder.append((CharSequence) bytesToHex.substring(i12, i12 + 2));
                    spannableStringBuilder.append(' ');
                }
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr3[i14 + 19] & 255) | ((bArr3[i14 + 16] & Byte.MAX_VALUE) << 24) | ((bArr3[i14 + 17] & 255) << 16) | ((bArr3[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb2.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb2.append(strArr[i15 % strArr.length]);
                }
                this.f38143r = sb2.toString();
            }
            this.f38139b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, str, str)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.d61(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f38138a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f38142n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f38142n = null;
        }
        this.f38140c.setAlpha(0.0f);
        this.f38139b.setAlpha(1.0f);
        this.f38140c.setScaleX(0.0f);
        this.f38140c.setScaleY(0.0f);
        this.f38139b.setScaleX(1.0f);
        this.f38139b.setScaleY(1.0f);
        this.f38140c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.i6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f38140c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        TextView textView = this.f38138a;
        int i10 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38139b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38138a, 2, null, null, null, null, org.telegram.ui.ActionBar.i6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new h7(this, 3));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new h7(this, 3));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f38143r) != null) {
            TextView textView = this.f38140c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
