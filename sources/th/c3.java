package th;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class c3 {
    public final int f48844a;
    public final ImageReceiver f48845b;
    public int f48846c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.t5 f48847f;
    public final org.telegram.ui.Components.t5 f48848g;
    public final org.telegram.ui.Components.t5 h;
    public float f48849i;
    public float f48850j;
    public float f48851k;
    public final boolean f48852l;
    public final RectF f48853m;
    public final RectF f48854n;

    public c3(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f48845b = imageReceiver;
        this.f48846c = 0;
        this.d = false;
        this.e = 1.0f;
        gr grVar = gr.h;
        this.f48847f = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.f48848g = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.h = new org.telegram.ui.Components.t5(profileStoriesView, 420L, grVar);
        this.f48853m = new RectF();
        this.f48854n = new RectF();
        this.f48844a = storyItem.f20032id;
        imageReceiver.J0(org.telegram.messenger.i0.L(200.0f));
        imageReceiver.H0(profileStoriesView);
        this.f48852l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f34090y) {
            imageReceiver.P();
        }
        u10[] u10VarArr = w5.f49587a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject d22 = wp.r1(imageReceiver.d).d2(storyItem.dialogId);
            r8Var.l(d22);
            imageReceiver.i0(d22, r8Var, null);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(jc.c(b8.w(document.thumbs, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ic.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.u0(null, null, jc.i(b8.w(arrayList, org.telegram.messenger.i0.L(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ic.m(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.f();
            }
        }
    }
}
