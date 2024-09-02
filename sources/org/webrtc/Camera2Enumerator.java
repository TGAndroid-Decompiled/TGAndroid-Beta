package org.webrtc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.AndroidException;
import android.util.Range;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.camera.Camera2Session$$ExternalSyntheticApiModelOutline19;
import org.telegram.messenger.camera.Camera2Session$$ExternalSyntheticApiModelOutline9;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

@TargetApi(21)
public class Camera2Enumerator implements CameraEnumerator {
    private static final double NANO_SECONDS_PER_SECOND = 1.0E9d;
    private static final String TAG = "Camera2Enumerator";
    private static final Map<String, List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats = new HashMap();
    final CameraManager cameraManager;
    final Context context;

    public Camera2Enumerator(Context context) {
        this.context = context;
        this.cameraManager = Camera2Session$$ExternalSyntheticApiModelOutline9.m(context.getSystemService("camera"));
    }

    @Override
    public String[] getDeviceNames() {
        String[] cameraIdList;
        try {
            cameraIdList = this.cameraManager.getCameraIdList();
            return cameraIdList;
        } catch (AndroidException e) {
            Logging.e("Camera2Enumerator", "Camera access exception: " + e);
            return new String[0];
        }
    }

    @Override
    public boolean isFrontFacing(String str) {
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null) {
            key = CameraCharacteristics.LENS_FACING;
            obj = cameraCharacteristics.get(key);
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBackFacing(String str) {
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(str);
        if (cameraCharacteristics != null) {
            key = CameraCharacteristics.LENS_FACING;
            obj = cameraCharacteristics.get(key);
            if (((Integer) obj).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(this.context, str);
    }

    @Override
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera2Capturer(this.context, str, cameraEventsHandler);
    }

    private CameraCharacteristics getCameraCharacteristics(String str) {
        CameraCharacteristics cameraCharacteristics;
        try {
            cameraCharacteristics = this.cameraManager.getCameraCharacteristics(str);
            return cameraCharacteristics;
        } catch (AndroidException e) {
            Logging.e("Camera2Enumerator", "Camera access exception: " + e);
            return null;
        }
    }

    public static boolean isSupported(Context context) {
        String[] cameraIdList;
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Object obj;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        CameraManager m = Camera2Session$$ExternalSyntheticApiModelOutline9.m(context.getSystemService("camera"));
        try {
            cameraIdList = m.getCameraIdList();
            for (String str : cameraIdList) {
                cameraCharacteristics = m.getCameraCharacteristics(str);
                key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                obj = cameraCharacteristics.get(key);
                if (((Integer) obj).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Logging.e("Camera2Enumerator", "Camera access exception: " + th);
            return false;
        }
    }

    public static int getFpsUnitFactor(Range<Integer>[] rangeArr) {
        Comparable upper;
        if (rangeArr.length == 0) {
            return 1000;
        }
        upper = rangeArr[0].getUpper();
        return ((Integer) upper).intValue() < 1000 ? 1000 : 1;
    }

    public static List<Size> getSupportedSizes(CameraCharacteristics cameraCharacteristics) {
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics.Key key2;
        Object obj2;
        android.util.Size[] outputSizes;
        CameraCharacteristics.Key key3;
        Object obj3;
        key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        obj = cameraCharacteristics.get(key);
        StreamConfigurationMap m = Camera2Session$$ExternalSyntheticApiModelOutline19.m(obj);
        key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        obj2 = cameraCharacteristics.get(key2);
        int intValue = ((Integer) obj2).intValue();
        outputSizes = m.getOutputSizes(SurfaceTexture.class);
        List<Size> convertSizes = convertSizes(outputSizes);
        if (Build.VERSION.SDK_INT >= 22 || intValue != 2) {
            return convertSizes;
        }
        key3 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        obj3 = cameraCharacteristics.get(key3);
        Rect rect = (Rect) obj3;
        ArrayList arrayList = new ArrayList();
        for (Size size : convertSizes) {
            if (rect.width() * size.height == rect.height() * size.width) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(Context context, String str) {
        return getSupportedFormats(Camera2Session$$ExternalSyntheticApiModelOutline9.m(context.getSystemService("camera")), str);
    }

    static List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String str) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics.Key key2;
        Object obj2;
        long j;
        int round;
        Map<String, List<CameraEnumerationAndroid.CaptureFormat>> map = cachedSupportedFormats;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                Logging.d("Camera2Enumerator", "Get supported formats for camera index " + str + ".");
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    obj = cameraCharacteristics.get(key);
                    StreamConfigurationMap m = Camera2Session$$ExternalSyntheticApiModelOutline19.m(obj);
                    key2 = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                    obj2 = cameraCharacteristics.get(key2);
                    Range[] rangeArr = (Range[]) obj2;
                    List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = convertFramerates(rangeArr, getFpsUnitFactor(rangeArr));
                    List<Size> supportedSizes = getSupportedSizes(cameraCharacteristics);
                    Iterator<CameraEnumerationAndroid.CaptureFormat.FramerateRange> it = convertFramerates.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        i = Math.max(i, it.next().max);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Size size : supportedSizes) {
                        try {
                            j = m.getOutputMinFrameDuration(SurfaceTexture.class, new android.util.Size(size.width, size.height));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        if (j == 0) {
                            round = i;
                        } else {
                            double d = j;
                            Double.isNaN(d);
                            round = ((int) Math.round(1.0E9d / d)) * 1000;
                        }
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, 0, round));
                        Logging.d("Camera2Enumerator", "Format: " + size.width + "x" + size.height + "@" + round);
                    }
                    cachedSupportedFormats.put(str, arrayList);
                    Logging.d("Camera2Enumerator", "Get supported formats for camera index " + str + " done. Time spent: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms.");
                    return arrayList;
                } catch (Exception e) {
                    Logging.e("Camera2Enumerator", "getCameraCharacteristics(): " + e);
                    return new ArrayList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static List<Size> convertSizes(android.util.Size[] sizeArr) {
        int width;
        int height;
        ArrayList arrayList = new ArrayList();
        for (android.util.Size size : sizeArr) {
            width = size.getWidth();
            height = size.getHeight();
            arrayList.add(new Size(width, height));
        }
        return arrayList;
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(Range<Integer>[] rangeArr, int i) {
        Comparable lower;
        Comparable upper;
        ArrayList arrayList = new ArrayList();
        for (Range<Integer> range : rangeArr) {
            lower = range.getLower();
            int intValue = ((Integer) lower).intValue() * i;
            upper = range.getUpper();
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(intValue, ((Integer) upper).intValue() * i));
        }
        return arrayList;
    }
}
