package org.webrtc;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.google.android.exoplayer2.util.ListenerSet;
import org.telegram.messenger.pip.PipActivityController;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;

public final class SurfaceViewRenderer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final int f$2;

    public SurfaceViewRenderer$$ExternalSyntheticLambda0(int i, int i2, DialogsSearchAdapter.OnRecentSearchLoaded onRecentSearchLoaded) {
        this.$r8$classId = 6;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$0 = onRecentSearchLoaded;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SurfaceViewRenderer) this.f$0).lambda$onFrameResolutionChanged$0(this.f$1, this.f$2);
                break;
            case 1:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f$0;
                exoPlayerImpl.getClass();
                ExoPlayerImpl$$ExternalSyntheticLambda23 exoPlayerImpl$$ExternalSyntheticLambda23 = new ExoPlayerImpl$$ExternalSyntheticLambda23(this.f$1, this.f$2, 1);
                ListenerSet listenerSet = exoPlayerImpl.listeners;
                listenerSet.queueEvent(24, exoPlayerImpl$$ExternalSyntheticLambda23);
                listenerSet.flushEvents();
                break;
            case 2:
                ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(this.f$1, this.f$2);
                break;
            case 3:
                VoIPGroupNotification.decline((Context) this.f$0, this.f$1, this.f$2);
                break;
            case 4:
                ((VoIPService) this.f$0).lambda$initiateActualEncryptedCall$86(this.f$1, this.f$2);
                break;
            case 5:
                ((ConnectionsManager) this.f$0).lambda$discardConnection$0(this.f$1, this.f$2);
                break;
            case 6:
                DialogsSearchAdapter.lambda$loadRecentSearch$8(this.f$1, this.f$2, (DialogsSearchAdapter.OnRecentSearchLoaded) this.f$0);
                break;
            case 7:
                RTMPStreamPipOverlay rTMPStreamPipOverlay = RTMPStreamPipOverlay.this;
                PipSource pipSource = rTMPStreamPipOverlay.pipSource;
                if (pipSource != null) {
                    Point point = (Point) pipSource.params.defaultPublishableKey;
                    int i = point.x;
                    int i2 = this.f$1;
                    int i3 = this.f$2;
                    if (i != i2 || point.y != i3) {
                        point.set(i2, i3);
                        pipSource.checkAvailable(true);
                        PipActivityController pipActivityController = pipSource.controller;
                        if (pipActivityController.maxPrioritySource == pipSource) {
                            PipUtils.applyPictureInPictureParams(pipActivityController.activity, pipSource);
                            MediaSessionConnector mediaSessionConnector = pipActivityController.mediaSessionConnector;
                            if (mediaSessionConnector != null) {
                                mediaSessionConnector.setPlayer(pipSource.player);
                            }
                        }
                        pipActivityController.pipContentView.invalidate();
                    }
                }
                rTMPStreamPipOverlay.bindTextureView(false);
                break;
            case 8:
                ((SurfaceTextureHelper) this.f$0).lambda$setTextureSize$2(this.f$1, this.f$2);
                break;
            default:
                ((TextureViewRenderer) this.f$0).lambda$updateVideoSizes$1(this.f$1, this.f$2);
                break;
        }
    }

    public SurfaceViewRenderer$$ExternalSyntheticLambda0(ExoPlayerImpl.ComponentListener componentListener, SurfaceTexture surfaceTexture, int i, int i2) {
        this.$r8$classId = 2;
        this.f$0 = componentListener;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public SurfaceViewRenderer$$ExternalSyntheticLambda0(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
