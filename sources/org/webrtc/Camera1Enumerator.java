package org.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.p6;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i10) {
        int i11;
        Logging.d("Camera1Enumerator", "Get supported formats for camera index " + i10 + ".");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Camera camera = null;
        try {
            try {
                Logging.d("Camera1Enumerator", "Opening camera with index " + i10);
                camera = Camera.open(i10);
                Camera.Parameters parameters = camera.getParameters();
                camera.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i12 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i12 = iArr[0];
                        i11 = iArr[1];
                    } else {
                        i11 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i12, i11));
                    }
                } catch (Exception e7) {
                    Logging.e("Camera1Enumerator", "getSupportedFormats() failed on camera index " + i10, e7);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                StringBuilder l4 = i2.g.l(i10, "Get supported formats for camera index ", " done. Time spent: ");
                l4.append(elapsedRealtime2 - elapsedRealtime);
                l4.append(" ms.");
                Logging.d("Camera1Enumerator", l4.toString());
                return arrayList;
            } catch (RuntimeException e10) {
                Logging.e("Camera1Enumerator", "Open camera failed on camera index " + i10, e10);
                ArrayList arrayList2 = new ArrayList();
                if (camera != null) {
                    camera.release();
                }
                return arrayList2;
            }
        } catch (Throwable th2) {
            if (camera != null) {
                camera.release();
            }
            throw th2;
        }
    }

    public static int getCameraIndex(String str) {
        Logging.d("Camera1Enumerator", "getCameraIndex: " + str);
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            if (str.equals(getDeviceName(i10))) {
                return i10;
            }
        }
        throw new IllegalArgumentException(p6.i("No such camera: ", str));
    }

    private static Camera.CameraInfo getCameraInfo(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i10, cameraInfo);
            return cameraInfo;
        } catch (Exception e7) {
            Logging.e("Camera1Enumerator", "getCameraInfo failed on index " + i10, e7);
            return null;
        }
    }

    public static String getDeviceName(int i10) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i10);
        if (cameraInfo == null) {
            return null;
        }
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        return "Camera " + i10 + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
    }

    @Override
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    @Override
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < Camera.getNumberOfCameras(); i10++) {
            String deviceName = getDeviceName(i10);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.d("Camera1Enumerator", "Index: " + i10 + ". " + deviceName);
            } else {
                Logging.e("Camera1Enumerator", "Index: " + i10 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        if (cameraInfo != null && cameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    public Camera1Enumerator(boolean z10) {
        this.captureToTexture = z10;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i10) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            try {
                if (cachedSupportedFormats == null) {
                    cachedSupportedFormats = new ArrayList();
                    for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
                        cachedSupportedFormats.add(enumerateFormats(i11));
                    }
                }
                list = cachedSupportedFormats.get(i10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }
}
