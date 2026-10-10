package zg;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.fz;
public final class d {
    public static int f54534m;
    public s5 f54535a;
    public Rect f54536b;
    public ArrayList f54537c;
    public View d;
    public long f54538e;
    public boolean f54539f;
    public boolean f54540g;
    public int h;
    public boolean f54541i;
    public ImageReceiver f54542j;
    public int f54543k;
    public long f54544l;

    public static d a(s5 s5Var, boolean z10, boolean z11) {
        int i10 = UserConfig.selectedAccount;
        ?? obj = new Object();
        obj.f54536b = new Rect();
        obj.f54537c = new ArrayList();
        obj.f54540g = true;
        obj.f54543k = -1;
        obj.f54535a = s5Var;
        obj.f54539f = z10;
        obj.h = i10;
        obj.f54541i = z11;
        obj.f54538e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            obj.f54542j = imageReceiver;
            if (z10) {
                imageReceiver.setAllowDrawWhileCacheGenerating(true);
            }
        }
        return obj;
    }

    public final void b(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: zg.d.b(android.graphics.Canvas):void");
    }

    public final boolean c() {
        if (System.currentTimeMillis() - this.f54538e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f54535a.o(view);
        ImageReceiver imageReceiver = this.f54542j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f54536b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f54542j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f54539f;
        int i10 = this.h;
        s5 s5Var = this.f54535a;
        s5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f54542j;
        if (imageReceiver != null && this.f54541i) {
            imageReceiver.onAttachedToWindow();
            TLRPC.Document document2 = s5Var.f30675e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
            if (findAnimatedEmojiEmoticon != null && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = f54534m;
                    f54534m = i11 + 1;
                    sb2.append(i11);
                    sb2.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb2.toString());
                    int f7 = fz.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    String a2 = j0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
                }
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
            if (!z11) {
                String str = UserConfig.getInstance(i10).genericAnimationsStickerPack;
                if (str != null && (tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByName(str)) == null) {
                    tL_messages_stickerSet = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
                }
                if (tL_messages_stickerSet != null) {
                    if (this.f54543k < 0) {
                        this.f54543k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = f54534m;
                        f54534m = i12 + 1;
                        sb3.append(i12);
                        sb3.append(" ");
                        imageReceiver.setUniqKeyPrefix(sb3.toString());
                        int f10 = fz.f();
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f54543k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f54543k), 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f54543k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f54543k), 0);
                    }
                    z11 = z10;
                }
            }
            if (z11) {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, z10);
                }
                imageReceiver.setAutoRepeat(0);
                return;
            }
            imageReceiver.setImageBitmap(new dk0(R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
