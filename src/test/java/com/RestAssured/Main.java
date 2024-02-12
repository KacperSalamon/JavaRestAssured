package com.RestAssured;

public class Main {
    public static void main(String[] args) {
        String str = "test"; /*"{\n" +
                "    \"id\": \"{{businessRuleId}}\",\n" +
                "    \"trigger\": \"directAccrual\",\n" +
                "    \"name\": \"promotionAllFields\",\n" +
                "    //\"description\" : \"desc\",\n" +
                "    \"datetimeRange\": {\n" +
                "        \"startDatetime\": \"2016-01-25T21:34:55\",\n" +
                "        \"endDatetime\": \"2016-01-25T21:34:55\",\n" +
                "        \"operationalTimezone\": \"+02:00\"\n" +
                "    },\n" +
                "    \"promotionRules\": {\n" +
                "        \"rule2\": {\n" +
                "            \"id\": \"rule2\",\n" +
                "            \"userConditionExpression\": \"1+1 == 2\",\n" +
                "            \"partners\": [\n" +
                "              \"default\"\n" +
                "            ],\n" +
                "            \"name\": \"rule1\",\n" +
                "            \"effects\": {\n" +
                "                \"effect2\": {\n" +
                "                    \"id\": \"effect2\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"10\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 10\n" +
                "                },\n" +
                "                \"effect3\": {\n" +
                "                    \"id\": \"effect3\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1234.123\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 10\n" +
                "                },\n" +
                "                \"effect5\": {\n" +
                "                    \"id\": \"effect5\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect6\": {\n" +
                "                    \"id\": \"effect6\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect7\": {\n" +
                "                    \"id\": \"effect7\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect8\": {\n" +
                "                    \"id\": \"effect8\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect9\": {\n" +
                "                    \"id\": \"effect9\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect10\": {\n" +
                "                    \"id\": \"effect10\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect11\": {\n" +
                "                    \"id\": \"effect11\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect12\": {\n" +
                "                    \"id\": \"effect12\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect13\": {\n" +
                "                    \"id\": \"effect13\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect14\": {\n" +
                "                    \"id\": \"effect14\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect15\": {\n" +
                "                    \"id\": \"effect15\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect16\": {\n" +
                "                    \"id\": \"effect16\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect17\": {\n" +
                "                    \"id\": \"effect17\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect18\": {\n" +
                "                    \"id\": \"effect18\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect19\": {\n" +
                "                    \"id\": \"effect19\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect20\": {\n" +
                "                    \"id\": \"effect20\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect21\": {\n" +
                "                    \"id\": \"effect21\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect22\": {\n" +
                "                    \"id\": \"effect22\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect23\": {\n" +
                "                    \"id\": \"effect23\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect24\": {\n" +
                "                    \"id\": \"effect24\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect25\": {\n" +
                "                    \"id\": \"effect25\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect26\": {\n" +
                "                    \"id\": \"effect26\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect27\": {\n" +
                "                    \"id\": \"effect27\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect28\": {\n" +
                "                    \"id\": \"effect28\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect29\": {\n" +
                "                    \"id\": \"effect29\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect30\": {\n" +
                "                    \"id\": \"effect30\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect31\": {\n" +
                "                    \"id\": \"effect31\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect32\": {\n" +
                "                    \"id\": \"effect32\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"effect33\": {\n" +
                "                    \"id\": \"effect33\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                },\n" +
                "                \"{{businessRuleId}}\": {\n" +
                "                    \"id\": \"{{businessRuleId}}\",\n" +
                "                    \"resultingEventDefinitionId\": \"points\",\n" +
                "                    \"name\": \"effect\",\n" +
                "                    \"attributes\": {\n" +
                "                        \"points\": {\n" +
                "                            \"attributeId\": \"points\",\n" +
                "                            \"value\": \"1111.1\",\n" +
                "                            \"mode\": \"expression\"\n" +
                "                        },\n" +
                "                        \"pointType\": {\n" +
                "                            \"attributeId\": \"pointType\",\n" +
                "                            \"value\": \"default\",\n" +
                "                            \"mode\": \"static\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    \"order\": 8\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";*/

        String wordToFind = "{{businessRuleId}}";
        int count = countOccurrences(str, wordToFind);

        System.out.println("Liczba wystąpień słowa '" + wordToFind + "' w stringu: " + count);
    }

    public static int countOccurrences(String text, String word) {
        String[] words = text.split("\\W+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}

