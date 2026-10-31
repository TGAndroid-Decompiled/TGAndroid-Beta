package th;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class c3 {
    public final int f48830a;
    public final ImageReceiver f48831b;
    public int f48832c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.t5 f48833f;
    public final org.telegram.ui.Components.t5 f48834g;
    public final org.telegram.ui.Components.t5 h;
    public float f48835i;
    public float f48836j;
    public float f48837k;
    public final boolean f48838l;
    public final RectF f48839m;
    public final RectF f48840n;

    public c3(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f48831b = imageReceiver;
        this.f48832c = 0;
        this.d = false;
        this.e = 1.0f;
        gr grVar = gr.h;
        this.f48833f = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.f48834g = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.h = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.f48839m = new RectF();
        this.f48840n = new RectF();
        this.f48830a = storyItem.f20031id;
        imageReceiver.J0(org.telegram.messenger.i0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f48838l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34083y) {
            imageReceiver.P();
        }
        u10[] u10VarArr = w5.f49573a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject d22 = vp.r1(imageReceiver.d).d2(storyItem.dialogId);
            r8Var.l(d22);
            imageReceiver.i0(d22, r8Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(ic.c(b8.w(document.thumbs, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, ic.i(b8.w(arrayList, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
