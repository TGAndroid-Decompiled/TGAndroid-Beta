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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.gz;
public final class d {
    public static int f49303m;
    public p5 f49304a;
    public Rect f49305b;
    public ArrayList f49306c;
    public View d;
    public long e;
    public boolean f49307f;
    public boolean f49308g;
    public int h;
    public boolean f49309i;
    public ImageReceiver f49310j;
    public int f49311k;
    public long f49312l;

    public static d a(p5 p5Var, boolean z10, boolean z11) {
        int i10 = UserConfig.selectedAccount;
        ?? obj = new Object();
        obj.f49305b = new Rect();
        obj.f49306c = new ArrayList();
        obj.f49308g = true;
        obj.f49311k = -1;
        obj.f49304a = p5Var;
        obj.f49307f = z10;
        obj.h = i10;
        obj.f49309i = z11;
        obj.e = System.currentTimeMillis();
        if (z11 && LiteMode.isEnabled(4112)) {
            ImageReceiver imageReceiver = new ImageReceiver();
            obj.f49310j = imageReceiver;
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
        if (System.currentTimeMillis() - this.e > 2500) {
            return true;
        }
        return false;
    }

    public final void d(View view) {
        this.f49304a.o(view);
        ImageReceiver imageReceiver = this.f49310j;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            imageReceiver.clearImage();
        }
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Rect rect = this.f49305b;
        rect.set(i10, i11, i12, i13);
        ImageReceiver imageReceiver = this.f49310j;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(rect);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.Document document;
        boolean z12 = this.f49307f;
        int i10 = this.h;
        p5 p5Var = this.f49304a;
        p5Var.a(view);
        this.d = view;
        ImageReceiver imageReceiver = this.f49310j;
        if (imageReceiver != null && this.f49309i) {
            imageReceiver.onAttachedToWindow();
            TLRPC.Document document2 = p5Var.e;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document2, null);
            if (findAnimatedEmojiEmoticon != null && (tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(findAnimatedEmojiEmoticon)) != null && (document = tL_availableReaction.around_animation) != null) {
                if (z12) {
                    StringBuilder sb2 = new StringBuilder();
                    int i11 = f49303m;
                    f49303m = i11 + 1;
                    sb2.append(i11);
                    sb2.append(" ");
                    imageReceiver.setUniqKeyPrefix(sb2.toString());
                    int f7 = gz.f();
                    TLRPC.Document document3 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), f7 + "_" + f7 + "_pcache_compress", null, null, document3, 0);
                } else {
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    String a2 = k0.a();
                    TLRPC.Document document4 = tL_availableReaction.around_animation;
                    z10 = true;
                    imageReceiver.setImage(forDocument, a2, null, null, document4, 0);
                }
                z11 = true;
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
                    if (this.f49311k < 0) {
                        this.f49311k = Math.abs(Utilities.fastRandom.nextInt() % tL_messages_stickerSet.documents.size());
                    }
                    if (z12) {
                        StringBuilder sb3 = new StringBuilder();
                        int i12 = f49303m;
                        f49303m = i12 + 1;
                        sb3.append(i12);
                        sb3.append(" ");
                        imageReceiver.setUniqKeyPrefix(sb3.toString());
                        int f10 = gz.f();
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f49311k)), f10 + "_" + f10 + "_pcache_compress", null, null, tL_messages_stickerSet.documents.get(this.f49311k), 0);
                    } else {
                        imageReceiver.setImage(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(this.f49311k)), "60_60", null, null, tL_messages_stickerSet.documents.get(this.f49311k), 0);
                    }
                    z11 = true;
                }
            }
            if (z11) {
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, z10);
                }
                imageReceiver.setAutoRepeat(0);
                return;
            }
            imageReceiver.setImageBitmap(new hj0(R.raw.custom_emoji_reaction, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null));
        }
    }
}
