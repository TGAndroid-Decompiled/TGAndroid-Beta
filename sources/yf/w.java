package yf;
public enum w {
    UNKNOWN_DELAY_DURATION(0, "unknown delay"),
    INPUT_HANDLING_DURATION(1, "input"),
    ANIMATION_DURATION(2, "animation"),
    LAYOUT_MEASURE_DURATION(3, "layout"),
    DRAW_DURATION(4, "draw"),
    SYNC_DURATION(5, "sync"),
    COMMAND_ISSUE_DURATION(6, "cmd issue"),
    SWAP_BUFFERS_DURATION(7, "swap buffers"),
    EF99(31, "GPU_DURATION", "gpu"),
    TOTAL_DURATION(8, "total");
    
    public final int f51020a;
    public final String f51021b;
    public final int f51022c;
    public long d;
    public double f51023e;

    w(int i10, String str) {
        this(24, r7, str);
    }

    w(int i10, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.f51023e = 0.0d;
        this.f51020a = r4;
        this.f51021b = str2;
        this.f51022c = i10;
    }
}
