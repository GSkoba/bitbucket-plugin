require(['@atlassian/clientside-extensions-registry'], function (registry) {

    function test(extensionAPI, context) {
        return {
            type: 'button',
            label: `Hello DevFest 2020!`,
            onAction: function () {
            },
            disabled: true,
            hidden: hidden
        };
    }

    registry.registerExtension(
        'test:test-extension',
        test
    );
});