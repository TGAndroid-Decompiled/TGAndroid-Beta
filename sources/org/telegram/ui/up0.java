package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
public final class up0 implements Runnable {
    public final String f50171a;
    public final long f50172b;
    public final int f50173c;
    public final PhotoViewer d;

    public up0(PhotoViewer photoViewer, String str, long j10, int i3) {
        this.d = photoViewer;
        this.f50171a = str;
        this.f50172b = j10;
        this.f50173c = i3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        if (this.d.f41596y8 == this) {
            int E = MediaController.E(this.f50171a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.f50171a, iArr, this.f50172b);
            boolean z12 = false;
            if (iArr[10] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            PhotoViewer photoViewer = this.d;
            if (iArr[0] != 0 && (!z10 || iArr[9] != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            photoViewer.f41478l8 = z11;
            PhotoViewer photoViewer2 = this.d;
            if (E == -1) {
                E = iArr[3];
            }
            photoViewer2.f41444h8 = E;
            photoViewer2.f41452i8 = E;
            if (this.d.f41478l8) {
                PhotoViewer photoViewer3 = this.d;
                int i3 = iArr[1];
                photoViewer3.f41408d8 = i3;
                photoViewer3.f41428f8 = i3;
                PhotoViewer photoViewer4 = this.d;
                int i10 = iArr[2];
                photoViewer4.f41418e8 = i10;
                photoViewer4.f41436g8 = i10;
                PhotoViewer photoViewer5 = this.d;
                int max = Math.max(photoViewer5.f41408d8, this.d.f41418e8);
                if (max > 1280) {
                    photoViewer5.f41380a8 = 4;
                } else if (max > 854) {
                    photoViewer5.f41380a8 = 3;
                } else if (max > 640) {
                    photoViewer5.f41380a8 = 2;
                } else {
                    photoViewer5.f41380a8 = 1;
                }
                PhotoViewer photoViewer6 = this.d;
                int i11 = this.f50173c;
                if (i11 == -1) {
                    i11 = photoViewer6.y2();
                }
                photoViewer6.Z7 = i11;
                PhotoViewer photoViewer7 = this.d;
                if (photoViewer7.f41444h8 != 0 && photoViewer7.f41402d2 != 1) {
                    Size q02 = photoViewer7.q0();
                    if (q02.getWidth() == photoViewer7.f41408d8 && q02.getHeight() == photoViewer7.f41418e8) {
                        MediaController.v(q02.getWidth(), q02.getHeight(), photoViewer7.f41452i8, false);
                    } else {
                        MediaController.v(q02.getWidth(), q02.getHeight(), MediaController.Q(photoViewer7.f41418e8, photoViewer7.f41408d8, photoViewer7.f41452i8, q02.getHeight(), q02.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer8 = this.d;
                String str = this.f50171a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int w10 = MediaController.w(mediaExtractor, false);
                        if (w10 >= 0) {
                            if (mediaExtractor.getTrackFormat(w10).getString("mime").equals("video/avc")) {
                                z12 = true;
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    photoViewer8.f41485m8 = z12;
                } finally {
                    mediaExtractor.release();
                }
            }
            if (this.d.f41596y8 != this) {
                return;
            }
            org.telegram.messenger.g0.h3(new hc0(this, this, iArr, 23));
        }
    }
}
